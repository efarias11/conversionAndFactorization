import java.util.Scanner;
public class factorization {
    public static void main(String[] args) throws Exception{
        Scanner kb = new Scanner(System.in);
        /*
         do{
            System.out.print("Enter a positive integer to find its factor: ");
            int num = kb.nextInt();

            System.out.println("The factors of "+num+" are:");
            for(int i = 1; i<=num; i++ ){
                int f_num = num%i;
                
                if(f_num == 0)
                System.out.println(i);
            } 
            System.out.print("Do you want to find the factor of another number? (Y/N): ");
            char answr = kb.next().charAt(0);
            
            if(answr != 'Y' && answr != 'y')
                break; 

        }while (true);
        */
        while (true){
            System.out.print("Enter a positive integer to find its factor: ");
            int num = kb.nextInt();

            System.out.println("The factors of "+num+" are:");
            for(int i = 1; i<=num; i++ ){
                int f_num = num%i;
                
                if(f_num == 0)
                System.out.println(i);
            } 
            System.out.print("Do you want to find the factor of another number? (Y/N): ");
            char answr = kb.next().charAt(0);
            
            if(answr != 'Y' && answr != 'y')
                break;
        }
        /* 1) c
         * 2) a,b
         * 3) a
         * 4) b
         * 5) c
         */
    }
}
