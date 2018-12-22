public class item {
    String name,location, color, type;
    static int itemID;
    boolean claimed=false;
    item(String n,String l,String c,String t){
        name=n;
        location=l;
        color=c;
        type=t;
    }
    item(item b){
        name=b.name;
        location=b.location;
        color=b.color;
        type=b.type;
    }

}
