import java.util.Scanner;

public class ATM_Interface {
public static void main(String[] args) {
    int balance = 100000, withdraw, deposit;
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Automated Teller Machine");
        System.out.println("Choose 1 for withdraw: ");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4  for EXIT");
        System.out.println("Choose the operation you want to perform: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1: // withdraw amount 
            System.out.print("Enter money to be withdraw: ");
            withdraw = sc.nextInt();
            if (balance>= withdraw){
                balance = balance - withdraw;
                System.out.println("Plaese collect your money");
            }else {
                System.out.println("Insufficient Balance");
            }
            System.out.println("");
            break;

            case 2:  //deposit amount
            System.out.println("Enter money to be deposited: "); 
            deposit = sc.nextInt();
            balance = balance + deposit;
            System.out.println("Your money has been sucessfully deposited");
            System.out.println("");
            break;

            case 3:  // check bank balance 
            System.out.println("Balance : " + balance);
            System.out.println("");
            break;

            case 4: //exit from the program
            System.exit(0);
        }
        sc.close();
    }
}    
}
