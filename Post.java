public class Post {
    form secrutiy;
    item current;
    user poster;
    Post(form a,item b,user i){
        secrutiy=a;
        current=b;
        poster=i;
    }
    public void print(){
        System.out.print("name : "+current.name+"type : "+current.type+"color : "+current.color+"location : "+current.location+"\n");
    }

}
