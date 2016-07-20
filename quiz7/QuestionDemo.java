import java.util.Scanner;

/**
   This program shows a quiz with 5 questions.
*/
public class QuestionDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Set Questions 
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");

        NumericQuestion second = new NumericQuestion(0.01);
        second.setText("What is the length of the diagonal in a square whose sides have length 1?");
        second.setAnswer(Math.sqrt(2));
        
        ChoiceQuestion third = new ChoiceQuestion();
        third.setText("In which country was the inventor of Java born?");
        third.addChoice("Australia", false);
        third.addChoice("Canada", true);
        third.addChoice("Denmark", false);
        third.addChoice("United States", false);
        
        Question fourth = new TrueFalseQuestion();
        fourth.setText("Albert Einstein was the inventer of Java.");
        fourth.setAnswer("False");
        
        Question fifth = new TrueFalseQuestion2();
        fifth.setText("Elon Musk is the CEO of Tesla Motors.");
        fifth.setAnswer("True");

        int score = 0;
        score = score + presentQuestion(first, in);
        score = score + presentQuestion(second, in);
        score = score + presentQuestion(third, in);
        score = score + presentQuestion(fourth, in);
        score = score + presentQuestion(fifth, in);
        System.out.println("Your score: " + score);
    }

    /**
       Presents a question to the user and obtains a response.
       @param q the question to present
       @param in the scanner from which to read the user input
       @return the score (1 if correct, 0 if incorrect)
    */
    public static int presentQuestion(Question q, Scanner in)
    {
        q.display();
        System.out.println("Your answer:");
        String response = in.nextLine();
        boolean outcome = q.checkAnswer(response);
        System.out.println(outcome);
        if (outcome)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
