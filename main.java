import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.println("1) Register\n2) Login");
        int choice=in.nextInt();
        if (choice==1){Register a=new Register();}
        else if (choice==2){Login a=new Login();}
        */
        int oh = 1;
        Login b;
        Register a;
        while (oh == 1 || oh == 2) {
            System.out.println("1-register\n2-login\nelse exit");
            oh = in.nextInt();
            if (oh == 1){
                a = new Register();
                b=new Login(a.newuser);
            }
            else if (oh == 2)
                b= new Login(0);
            else
                break;
            if (b.curr != null) {
                while (true) {
                    System.out.println("1- Make Post\n2-Delete Post\n3-Update Post\n4-Update Account\n5-View Your posts\n6-to search \n7-to sign out ");
                    int choose = in.nextInt();
                    if (choose == 1) {
                        PostControl.makePost(b.curr);
                    } else if (choose == 2) {
                        PostControl.deletePost(b.curr);
                    } else if (choose == 3) {
                        PostControl.UpdatePostState(b.curr);
                    } else if (choose == 4) {
                        b.GetUpdate();
                    } else if (choose == 5) {
                        PostDB.search(b.curr);
                    } else if (choose == 6) {
                        PostControl.claim(b.curr);
                    } else if (choose == 7) {
                        break;
                    } else {
                        System.out.println("invalid input");
                        continue;
                    }
                }
            }
        }
    }
}