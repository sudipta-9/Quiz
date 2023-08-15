import java.util.*;

public class QuizApp {

    public static void main(String[] args) {
        // Create a list of questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of India?", "New Delhi"));
        questions.add(new Question("What is the highest mountain in the world?", "Mount Everest"));
        questions.add(new Question("What is the name of our president?", "Narendra Modi"));
        questions.add(new Question("What are the colours of our flag?", "Saffron, White and Green with an Ashoka Chakra in the middle"));

        // Start the quiz
        int score = 0;
        int currentQuestion = 0;
        Scanner scanner = new Scanner(System.in);
        while (currentQuestion < questions.size()) {
            // Get the current question
            Question question = questions.get(currentQuestion);
            System.out.println(question.getQuestion());

            // Get the user's answer
            String answer = scanner.nextLine();

            // Check the answer
            if (answer.equals(question.getAnswer())) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + question.getAnswer());
            }

            // Increment the current question number
            currentQuestion++;
        }

        // Display the final score
        System.out.println("You scored " + score + " out of " + questions.size() + ".");
    }
}

class Question {

    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
