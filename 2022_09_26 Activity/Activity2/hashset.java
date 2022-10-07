import java.util.HashSet;
import java.util.Scanner;

public class hashset{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<Integer>();
        while (true) {
            System.out.println("");
            System.out.println("==================HASHSETS===========");
            System.out.println("1. Add number");
            System.out.println("2. Remove number");
            System.out.println("3. Display numbers");
            System.out.println("4. Clear numbers");
            System.out.println("5. Exit");
            System.out.print("Select a menu: ");
            int choice = scan.nextInt();
            try {
                if (choice==1) {
                    System.out.print("A. Add a number: ");
                    int add = scan.nextInt();
                    if (numbers.contains(add)) {
                         System.out.println("");
                        System.out.println("Inputted number is alreay on the list");
                    } else {
                          numbers.add(add);
                        System.out.println("");
                        System.out.println("Succesfully added!");
                        System.out.println("");
                    }
                } else if (choice==2) {
                    System.out.print("B. Remove a number: ");
                    int input = scan.nextInt();
                    if (numbers.contains(input)){
                    numbers.removeIf(number -> number.equals(input));
                    System.out.println("");
                    System.out.println("Succesfully deleted!"); 
                    }else {
                        System.out.println("Inputted number is not on the list!");
                    }
                    
                    
                } else if (choice==3) {
                    System.out.println("");
                    System.out.println("Display Numbers");
                    if (numbers.isEmpty()){
                        System.out.println("No number added");
                    }else {
                    for (Integer i : numbers) {
                        System.out.print(" "+i);
                    }
                }
                } else if (choice==4) {
                    System.out.println("");
                    System.out.println("Cleared");
                    numbers.clear();
                    System.out.println("");
                } else if (choice==5) {
                    System.out.print("Terminated!");
                    System.exit(0);
                    break;
                }
                
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Please enter a number!");
                System.out.println("");
            }
    }
    scan.close();
}
}