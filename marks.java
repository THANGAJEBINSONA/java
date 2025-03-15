import java.util.Scanner;
public class marks{
    public static void main(String[]args){
    Scanner mark= new Scanner(System.in);
    System.out.println("Enter the mark:");
    int mrk=mark.nextInt();
    if(mrk>=90)
    {
        System.out.println("Grade A");

    }
    else if(mrk>=75)
    {
        System.out.println("Grade B");

    }
    else if(mrk>=50)
    {
        System.out.println("Grade C");

    }
    else{
        System.out.println("Grade F");
    }
}
}










