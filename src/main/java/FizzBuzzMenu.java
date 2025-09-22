import java.util.Scanner;

public class FizzBuzzMenu {
    public static void main(String[] args) {
        boolean running = true;
        double bankAccount = 0.0;
        Scanner sc = new Scanner(System.in);
        
        while(running) {
            int choice;
            System.out.println("------------Bank Account-------------");
            System.out.println("1. Add money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("--------------------------------------");
            System.out.println("Whats your choice?");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    double add = sc.nextDouble();
                    bankAccount += add;
                    break;
                case 2:
                    double subtract = sc.nextDouble();
                    bankAccount -= subtract;
                    break;
                case 3: 
                    System.out.println(bankAccount);
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye");
                    break;
            }
        }
    }
}
