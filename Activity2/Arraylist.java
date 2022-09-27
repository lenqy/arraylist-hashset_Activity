import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Arraylist{
    public static void main (String []args){
    Scanner input = new Scanner(System.in);
    List<Integer> integers = new ArrayList<Integer>();
    while(true){
         System.out.println("==================ArrayList adding, removing, displaying and clearing Menu===========");
         System.out.println("\nCHOOSE ANY FROM THE FOLLOWING:");
         System.out.println("1. Add");
         System.out.println("2. Remove");
         System.out.println("3. Display");
         System.out.println("4. Exit");
         System.out.println();
         System.out.println("Your choice");
        
         int choice = input.nextInt();

         if(choice==1){ 
            // Adding
            System.out.println("Enter an integer: ");
            integers.add(input.nextInt());
            System.out.println("Added" + integers);
         }
         else if(choice==2){
            // Removing

            System.out.println("Enter the number to remove: ");
            int elementToRemove = input.nextInt();
            if(integers.contains(elementToRemove)){
                integers.remove(Integer.valueOf(elementToRemove));
                System.out.println("Removed");
            } else{
                System.out.println("Elements not found");
            }
         }
         else if(choice==3){
            System.out.println("Your List: " + integers);
        }
        else if(choice==4){
            System.out.println("Thank you for using ArrayList");
            break;
        }
    }
    input.close();
}

}