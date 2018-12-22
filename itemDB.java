import java.util.Vector;

public class itemDB {
    static Vector<item> items=new Vector<>();
    static public void additem(item neww){
        items.add(neww);
    }
    static public boolean delete(item k){
        return items.remove(k);
    }
}
