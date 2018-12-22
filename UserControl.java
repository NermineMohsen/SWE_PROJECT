import java.util.Scanner;

public class UserControl {
  //  public static Verifyemail(String email){ }
    public static boolean VerifyInput(String pw){
        if (pw.length()<6){
            System.out.println("password is too short!");
            return false;
        }
        return true;
    }
    public static boolean UpdateAddress(user n,String num) {
        return UserDB.setaddress(n,num);
    }
    public static boolean UpdateNumber(user n,int num) {
           return UserDB.setphone(n,num);
    }
    public static boolean Updatepassword(user n,String pw){
        if (VerifyInput(pw)){
            return UserDB.setpassword(n,pw);
        }
        else{
            return false;
        }
    }
    public static user ValidateInfo(String n, String p, String e, String a, int ph){
        while (!VerifyInput(p)){
            Scanner in = new Scanner(System.in);
            System.out.println("re-enter password: ");
            p = in.next();
        }
        user b=new user(n,p,e,a,ph);
        UserDB.adduser(b);
        return b;
    }
    public static boolean Validation(String name, String email){
        return !UserDB.CheckExistence(name,email);
    }

}
