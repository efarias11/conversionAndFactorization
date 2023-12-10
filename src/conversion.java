import java.util.Scanner;
public class conversion {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        do{ 
            System.out.print("Enter a number of inches: ");
            double num = kb.nextDouble();

            System.out.println(num+" inches is "+(num*2.54)+" cm.");

            System.out.print("Do you want to enter another number? (Y/N): ");
            char answr = kb.next().charAt(0);

            if (answr != 'Y' && answr !='y'){
                System.out.println("Goodbye!");
                break;
            }
        }while (true);
    }
}
