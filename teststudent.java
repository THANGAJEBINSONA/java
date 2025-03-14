class student
{
    int id;
    String name;

}
public class teststudent{
    public static void main(String[]args)
    {
     student s1=new student();
     s1.id=118;
     System.out.println(s1.id);
     student s2=new student();
     s1.name="jebin";   
      System.out.println(s1.name);
      s2.id=106;
      s2.name="pandiyan";
      System.out.println(s2.id);
      System.out.println(s2.name);

    }
}