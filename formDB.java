import java.util.Scanner;
import java.util.Vector;

public class formDB {
    static Vector<form> items=new Vector<>();
    static public void addform(form neww){
        items.add(neww);
    }
    static public void Updateform(form n){
        for (form a:items){
            if (a==n){

                int i=0;
                for (;i<a.questions.size();i++){
                    System.out.println((i+1)+") "+a.questions.get(i));
                    System.out.println("ans: "+a.answers.get(i));
                }
                System.out.println("questions to edit/ or 0 to exit: ");
                Scanner s=new Scanner(System.in);
                int choice=s.nextInt();
                if (choice==0){return;}
                else if (choice<=i){
                    System.out.println("1- to edit answer\n2-to edit question\n0-to exit");
                    int tany=s.nextInt();
                    if (tany==1){
                        System.out.println("new answer: ");
                        String newval=s.next();
                        a.answers.remove(choice);
                        a.answers.add(choice,newval);
                      //  a.answers.set(choice,newval);
                    }
                    else if(tany==2){
                        System.out.println("new question: ");
                        String newval=s.next();
                        a.questions.remove(choice);
                        a.questions.add(choice,newval);
                    }
                    else if (tany!=0){
                        System.out.println("invalid input");
                        return;
                    }
                }
            return;
            }
        }
    }
    static public void delete(form n){
        itemDB.delete(n.current);
        items.remove(n);
    }
}
