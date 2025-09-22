import java.util.Scanner;

public class FizzBuzzMenu {
    public static void main(String[] args) {
        boolean running = true;
        
        Scanner sc = new Scanner(System.in);
        
        while(running) {
            int choice;
            System.out.println("------------FizzBuzz Menu-------------");
            System.out.println("1: Display Fizz numbers (multiples of 3)");
            System.out.println("2: Display Buzz numbers (multiples of 5)");
            System.out.println("3: Display FizzBuzz numbers (multiples of both 3 and 5)");
            System.out.println("4: Exit the program");
            System.out.println("--------------------------------------");
            System.out.println("Whats your choice?");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    for(int i = 0; i < 100; i++)
                    {
                        if (i % 3 == 0) {
                            System.out.println("All Fizz Values: " + i);
                        }
                    }
                    break;
                case 2:
                    for(int j = 0; j < 100; j++)
                    {
                        if (j % 5 == 0) {
                            System.out.println("All Buzz Values: " + j);
                        }
                    }
                    break;
                case 3: 
                    for(int k = 0; k < 100; k++)
                    {
                        if (k % 5 == 0 && k % 3 == 0) {
                            System.out.println("All FizzBuzz Values: " + k);
                        }
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye");
                    break;
            }
        }
    }
}
