import java.util.Vector;

public class UserDB {
    static Vector<user> users=new Vector<>();
    static public void adduser(user neww){
        users.add(neww);
    }
    static public boolean setpassword(user username,String newval){
        username.password=newval;
        return true;
    }
    static public boolean setaddress(user username,String newval){
        username.address=newval;
        return true;
    }
    static public user compareLoginInfo(String name,String pw){
        if (users.isEmpty()==false){
        for (user a:users){
            if (a.Name.equals(name)){
                if (a.password.equals(pw)){
                    return a;
                }
                else {
                    System.out.println("incorrect password!");
                    return null;
                }
            }

        }}
        System.out.println("invalid username");
        return null;
    }
    static public boolean setphone(user username,int newval){
        username.phone=newval;
        return true;
    }
    static public boolean CheckExistence(String username, String email){
        for (user a:users){
            if (a.Name.equals(username)){
                System.out.println("Username is already taken!");
                return true;
            }
        } for (user a:users){
            if (a.email.equals(email)){
                System.out.println("Email is already signed in!");
                return true;
            }
        }
        return false;
    }
}
