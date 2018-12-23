import java.util.Vector;

public class form {

    public Vector<String> questions=new Vector<>(),answers=new Vector<>();
    Vector<Vector<String>>userans=new Vector<>();
    Vector<user> replier=new Vector<>();

    item current;
    form(int id,Vector<String> q,Vector<String>a,item it){
        current=new item(it);
        questions=q;
        answers=a;
    }
    form(item it){
        current=new item(it);
    }
    /// add questions in questions and same for answers and connect with formID
}///claim post is using the useranswers
