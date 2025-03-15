import java.util.Scanner;
public class tollgate{
    public static void main(String[]args){
        int i;
        Scanner scann=new Scanner(System.in);
        for(i=1;i<=5;i++){
        System.out.println("enter the vechile name:");
        String name=scann.nextLine();
        
        
        if(name.equals("car"))
        {
            System.out.println("the toll fee is \"100\"");
        }
        else if(name.equals("truck"))
        {
             System.out.println("the toll fee is \"200\"");
        }
        else if (name.equals("carRFID")){
            System.out.println("the toll fee with 10% dissount is \"90\"");

        }
        else if (name.equals("truckRFID")){
            System.out.println("the toll fee with 10% dissount is \"190\"");

        }
        else{
            System.out.println("this is not a vechicle");
        }
        }

    }
}