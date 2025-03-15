class me
{
    String name;
    int id;

}
class my extends me{

}
public class program{
    public static void main(String[]args){
        my s1=new my();
        s1.id=112;
        s1.name="vinish";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}