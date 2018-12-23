import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Register {
    user newuser;
    Register() {
        System.out.println("Username :");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Email: ");
        String em = in.next();
        RegisterInfo(name, em);
    }

    void RegisterInfo(String n, String p, String e, String a, int ph) {
        newuser= UserControl.ValidateInfo(n,p,e,a,ph);
    }
    boolean RegisterInfo(String name, String email) {
        if (UserControl.Validation(name, email)) {
            System.out.println("Phone:");
            Scanner in = new Scanner(System.in);
            int phon = in.nextInt();
            System.out.println("password: ");
            String pw = in.next();
            System.out.println("Address: ");
            String add = in.next();
            RegisterInfo(name, pw, email, add, phon);
            return true;
        } else {
            return false;
        }

    }

}
