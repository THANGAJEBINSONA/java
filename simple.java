import java.util.Scanner;
public class simple{
    public static void main(String[]args)
    {
        Scanner hi=new Scanner(System.in);
        System.out.print("enter the user name:");
        String name= hi.nextLine();
        System.out.println("the name is :" +name);
    }
}