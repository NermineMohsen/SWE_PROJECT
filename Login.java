import java.util.Scanner;

public class Login {
    String n,p;
    public user curr=null;
    Login(user b){curr=b;}
    Login(int i){
        System.out.println("Username :");
        Scanner in=new Scanner(System.in);
        n=in.next();
        System.out.println("password: ");
        p=in.next();
        if(UserDB.compareLoginInfo(n,p)!=null){
            curr=UserDB.compareLoginInfo(n,p);
        }

    }
    boolean GetUpdate(){
        System.out.println("1- update password\n2-update address\n3-update phone number");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();
        if (choice==1){
            String newval=in.next();
            return UserControl.Updatepassword(curr,newval);
        }
        else if (choice==2){
            String newval=in.next();
            return UserControl.UpdateAddress(curr,newval);
        }
        else if (choice==3){
            int newval=in.nextInt();
            return UserControl.UpdateNumber(curr,newval);
        }
        else {
            System.out.println("invalid choice");
            return false;
        }
    }
}
