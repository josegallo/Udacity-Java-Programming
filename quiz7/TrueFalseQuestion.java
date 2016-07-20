
/**
 * A Question with a TrueFalseQuestion.
 */
public class TrueFalseQuestion extends Question
{
    /**
       Sets the question text.
       @param questionText the text of this question
    */
    public void setText(String questionText)
    {
        super.setText ("Answer True or False: " + questionText);
    }

    /**
       Checks a given response for correctness.
       @param response the response to check
       @return true if the response was correct, false otherwise
    */
    public boolean checkAnswer(String response)
    {
        if (response.equals("f")) {response = "False";}
        else if (response.equals("t")) {response = "True";}
        return response.toLowerCase().equals(super.getAnswer().toLowerCase());
    }
}
