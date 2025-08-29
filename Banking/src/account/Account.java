
public abstract class Account{
    private String accountNumber;
    private String holderName;
    private int SSN;
    private double balance;

    public void deposite();
    public void withdraw();
    public void transfer();
   abstract void showInfo();

    public Account(String accountNumber, String holderName, int SSN, double balance){
       this.accountNumber = accountNumber;
       this.holderName = holderName;
       this.SSN = SSN;
       this.balance = balance;
    }
    //Getter methods
    public String getAccountNumber(){
        return accountNumber;
    }
    //Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}