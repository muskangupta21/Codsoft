import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        int min = 1;    
        int max = 100; 
        int i = 1;      
        int range = (max - min);
        int ran = (int) (Math.random() * range) + min;  
        Scanner guess = new Scanner(System.in);
        System.out.println("Guess any number between 1 and 100: ");
        while (i <= 5) {
            System.out.println("Attempt :" + i);
            System.out.print("Enter your number: ");
            int num = guess.nextInt();
            if (ran > num) {
                System.out.println("Too low");
            } else if (ran < num) {
                System.out.println("Too high");
            } else {
                System.out.println("You got it!");
            }
            i++;
        }
        System.out.println("The number is " + ran);
    }
}
