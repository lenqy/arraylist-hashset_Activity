import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Arraylist{
   public static void main (String [] args){
      
      ArrayList<String> input = new ArrayList(); 
      Scanner scanner = new Scanner(System.in); 
      System.out.println("=======Creating ArrayList========");
      System.out.println("\n=======Just Input anything you want========");
        for (int i = 0; i < 5; i++) { 
            System.out.println("\nEnter your value " + (i + 1) + " : ");
            input.add(scanner.nextLine()); 
        } 
        System.out.println("ARRAYLIST VALUES: " + input); 
        scanner.close();
   }

}
