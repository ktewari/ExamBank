



import java.util.Vector;

public class MakeGoofyExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Fish Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What is  Goofy's Favourite Food?"));
            question.setChoiceA(("Bone"));
            question.setChoiceB(("Cup cake"));
            question.setChoiceC(("Bread"));
            question.setChoiceD(("Apple Sauce"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        {
            Question question = new Question();
            question.setQuery(("What is Goofy hobby"));
            question.setChoiceA(("Racing"));
            question.setChoiceB(("Sleeping"));
            question.setChoiceC(("Reading Books"));
            question.setChoiceD(("Travelling"));
            question.setAnswer(("b"));
            questions.addElement(question);
        }
        return exam;
    }

}
