import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class hashmap{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> numbers = new HashMap<String, Integer>();
        while (true) {
            System.out.println("");
            System.out.println("==================HASHMAPS===========");
            System.out.println("1. Add number");
            System.out.println("2. Remove number");
            System.out.println("3. Display numbers");
            System.out.println("4. Clear numbers");
            System.out.println("5. Exit");
            System.out.print("Select a menu: ");
            int choice = scan.nextInt();

            if (choice==1) {
                System.out.print(" Add a number: ");
                int numEntered;
                numEntered = scan.nextInt();
                boolean flag = false;
                for (int i = 2; i <= numEntered / 2; ++i) {
                    if (numEntered % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println(flag);
                    System.out.println("Sorry, the inputted number is a prime number");
                } else {
                    numbers.put("num",numEntered);
                    System.out.println("Succesfully added!");
                }
            } else if (choice==2) {
                System.out.print("Remove a number: ");
                int input = scan.nextInt();
                numbers.entrySet().removeIf(entry -> entry.getKey().equals(input));
                System.out.println("Succesfully deleted!");

             
            } else if (choice==3) {
                System.out.println("");
                System.out.println("Display Numbers");
                for (String i : numbers.keySet()) {
                    System.out.println(numbers.get(i));
                  }
            } else if (choice==4) {
                System.out.println("");
                System.out.println("Cleared");
                numbers.clear();
            } else if (choice==5) {
                System.out.print("Thank you for using HASHMAPS!");
                System.exit(0);
                break;
            }else{
                System.out.println("Invalid input try again");
            }
        } 
        scan.close();
    }

}
