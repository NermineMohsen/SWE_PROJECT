import java.util.Scanner;

public class formControl {
    static public void addform(form neww){
        formDB.addform(neww);
    }
    static public void Updateform(form n){
        formDB.Updateform(n);
    }
    static public void delete(form n){
        formDB.delete(n);
    }
}
