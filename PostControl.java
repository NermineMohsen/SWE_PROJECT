import java.util.Scanner;
import java.util.Vector;

public class PostControl {
    public static void makePost(user n) {
        System.out.println("name :");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("location: ");
        String loc = in.next();
        System.out.println("color: ");
        String color = in.next();
        System.out.println("type: ");
        String type = in.next();
        item a=new item(name, loc, color, type);
        itemDB.additem(a);
        System.out.println("number of questions for forms: ");
        int numques = in.nextInt();
        form b=new form(a);
        for (int i=0;i<numques;i++){
            System.out.println("question: ");
            b.questions.add(in.next());
            System.out.println("answer: ");
            b.answers.add(in.next());
        }
        formControl.addform(b);
        PostDB.addpost(new Post(b,a,n));
    }
    public static void UpdatePostState(user n) {
        System.out.println("name of item to update:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Post ret=PostDB.searchbyname(name);
        if (ret!=null){
            if (ret.poster==n){
                System.out.println("1) edit status \n2) edit form\n0 to exit");
                int wow=in.nextInt();
                if (wow==1) {
                    System.out.println("1 for claimed, 0 for still available :");
                    int stat = in.nextInt();
                    if (stat == 0) {
                        ret.current.claimed = false;
                    } else if (stat == 1) {
                        ret.current.claimed = true;
                    } else {
                        System.out.println("invalid input");
                    }
                }
                else if (wow==2){formControl.Updateform(ret.secrutiy);}
                else if (wow!=0){
                    System.out.println("invalid choice");
                    return;
                }
            }
        }
    }
    public static void deletePost(user n) {
        System.out.println("name of item to update:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Post ret=PostDB.searchbyname(name);
        if (ret!=null){
            if (ret.poster==n){
                formControl.delete(ret.secrutiy);
                PostDB.delete(ret);
                return;
            }
        }
    }
    public static void claim(user n){
        System.out.println("name of item to search for:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Post ret=PostDB.searchbyname(name);
        if (ret!=null){
            Vector<String> ans=new Vector<>();
            for (String a:ret.secrutiy.questions){
                System.out.println(a);
                ans.add(in.next());
            }
            ret.secrutiy.userans.add(ans);
            ret.secrutiy.replier.add(n);
        }
    }
}
