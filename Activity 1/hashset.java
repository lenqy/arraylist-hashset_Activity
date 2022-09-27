import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class hashset{

    public static void main(String [] args) {

    Set<String> hset=new HashSet<String>(); 
    Scanner scanner = new Scanner(System.in); 
    System.out.println("=======Creating HashSet========");
    System.out.println("\n=======Just Input anything you want========");
      for (int i = 0; i < 5; i++) { 
          System.out.println("\nEnter your value " + (i + 1) + " : ");
          hset.add(scanner.nextLine()); 
      } 
      System.out.println("Hash set Elements: "+ hset);  
      scanner.close();
    }
}