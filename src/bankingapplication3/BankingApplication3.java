package bankingapplication3;

import java.util.Random;
import java.util.Scanner;

public class BankingApplication3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = 0, number;
        Account account;
        String name;
        double balance,amount;
        
        Bank bank = new Bank("SCB");
        
        while(option !=6){
            System.out.println("Main Menu");
            
            System.out.println("1:Display All Accounts");
            System.out.println("2:Open New Acoount");
            System.out.println("3:Close Existing Account");
            System.out.println("4:Deposit");
            System.out.println("5:Withdraw");
            System.out.println("6:Exit");
            System.out.println();
            
            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            System.out.println();
            
            switch(option){
                case 1:
                    bank.listAcoounts();
                    break;
                case 2:
                    number = generateAccountNumber();
                    System.out.print("Enter Account Name: ");
                    name = scan.next();
                           
                    scan.nextLine();
                    
                    System.out.print("Enter Initial Balance: ");
                    balance = scan.nextDouble();
                    account = new Account(number,name,balance);
                    bank.openAcoount(account);
                    System.out.println();
                    break;
                            
                case 3:
                    System.out.print("Enter Account Number: ");
                    number = scan.nextInt();
                    bank.closeAcoount(number);
                    System.out.println("Account is Deleted");
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    number = scan.nextInt();
                    account = bank.getAccount(number);
                    System.out.print("Enter Amount: ");
                    amount = scan.nextDouble();
                    bank.depositMoney(account, amount);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Enter Account Number: ");
                    number = scan.nextInt();
                    account = bank.getAccount(number);
                    System.out.print("Enter Amount: ");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(account, amount);
                    System.out.println();
                    break;
            }
        }
    }
    
    public static int generateAccountNumber(){
        Random random= new Random();
        int accNumber= 100000 + random.nextInt(900000);
        return accNumber;
    }
}
