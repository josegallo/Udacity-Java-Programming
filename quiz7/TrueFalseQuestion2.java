// You are going to add a true/false type question to the question heirachy. Call it
// TrueFalseQuestion
//
// When the quiz is displayed, we want this text to preceed the question.
//     Answer True or False: question here
// We want the "Answer True or False: " to be prepended automatically.
// So if the user sets the text of the question to "Albert Einstein was the inventer of Java."
// the question will be displayed to the user like this
//      Answer True or False: Albert Einstein was the inventer of Java.
//
// Capitalization should not matter when determining if the answer is correct. Also t for true
// and f for false should be accepted.
//
// You will need to override three methods although not everyone will override the
// exact same three methods
//
// You will not need to add instance variables
//
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 9 - Question 2" for some tips on 
// how to begin.
//

/**
 * A Question with a TrueFalseQuestion.
 */
public class TrueFalseQuestion2 extends Question
{
    private String answer;
    /**
       Constructor
       @param questionText the text of this question
    */
    
    public TrueFalseQuestion2() 
    {
        super();
    }
    
    /**
       Sets the question text.
       @param questionText the text of this question
    */
    public void setText(String questionText)
    {
        super.setText ("Answer True or False: " + questionText);
    }

    /**
       Sets the answer for this question.
       @param correctResponse the answer
    */
    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }
    
    /**
       Checks a given response for correctness.
       @param response the response to check
       @return true if the response was correct, false otherwise
    */
    public boolean checkAnswer(String response)
    {
        if (response.toLowerCase().equals("f")) {response = "False";}
        else if (response.toLowerCase().equals("t")) {response = "True";}
        
       return response.toLowerCase().equals(answer.toLowerCase());
    }
}

