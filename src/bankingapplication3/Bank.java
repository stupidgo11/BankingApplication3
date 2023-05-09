package bankingapplication3;

public class Bank {
    private String name;
    
    public Bank(String name){
        this.name = name;
    }
    
    public void listAcoounts(){
        
    }
    
    public void openAcoount(Account account){
        
    }
    
    public void closeAcoount(int accountNumber){
        
    }
    
    public void depositMoney(Account account,double amount){
        account.deposit(amount);
    }
    
    public void withdrawMoney(Account account,double amount){
        account.withdraw(amount);
    }
    
    public Account getAccount(int number){
        String name= "AAA";
        double balance = 500.0;
        
        Account account = new Account(number,name,balance);
        
        return account;
    }
}
