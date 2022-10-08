import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        List<Laptop> laptops = new ArrayList<Laptop>();
        System.out.println("");
        System.out.println("Reminder for all the users. You can only input an integer not a string.");
        System.out.println(" ");

        try{
            System.out.print("How many objects do you want to create? ");
            Integer number = userinput.nextInt();
            
            if(number < 0){
                scan.close();
                userinput.close();

                throw new LaptopException("You inputted a negative number. Please input a positive index.");
            }

            for(int input = 0; input < number; input++){
                
                System.out.println("");
                System.out.print("Laptop's name: ");
                String lap_type = scan.nextLine();

                System.out.print("Laptop's Color: ");
                String lap_color = scan.nextLine();
    

                laptops.add(new Laptop(lap_type, lap_color));
            }

            System.out.println("\nHere's what we've got!");
            System.out.println("");
            for(Laptop list : laptops){
                System.out.println("Name of the Laptop: " + list.getTypeofLaptop() +  "Laptops Color: " + list.getColor());    
            System.out.println("");
            
            }

            userinput.close();
            scan.close();

        }
        catch(InputMismatchException ex){
            System.out.println("Oppsssssss!! Your input is not a number.");
        }

        catch(LaptopException e){
            System.out.println(e.getMessage());
        }


    }
}