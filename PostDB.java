import java.util.Scanner;
import java.util.Vector;

public class PostDB {
    static Vector<Post> items=new Vector<>();
    static public void addpost(Post neww){
        items.add(neww);
    }
    static void search(user usr) {
        int i=1;
        for (Post a:items){
            if (a.poster==usr){
                System.out.print(i++);
                a.print();
            }
        }
    } ///////////////////////
    static Post searchbyname(String name){
        Vector<Post> result=new Vector<>();
        for (Post a:items){
            if (a.current.name.equals(name)){
               result.add(a);
            }
        }
        System.out.println();
        int i=0;
        for (Post a:result){
            System.out.print(++i);
            a.print();
        }
        System.out.println("Choose number to view item, or 0 to exit");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();
        if (choice==0){return null;}
        else if(choice>0&&choice<=i){
            return result.get(i-1);
        }
        else {
            System.out.println("invalid entry");
            return null;}
    }
    static void delete(Post a){
        itemDB.delete(a.current);
        items.remove(a);
    }

}
