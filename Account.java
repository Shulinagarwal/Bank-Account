import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
    Scanner sc=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    
    public double getSavingBalance(){
        return savingBalance;
    }

    public double calCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }

    public double calSavingWithdraw(double amount){
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }

    public double calCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }

    public double calSavingDeposit(double amount){
        savingBalance=(savingBalance+amount);
        return savingBalance;
    }


    public void getCheckingWithdrawInput(){
        System.out.println("checking Account balance:" + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw ");
        double amount=sc.nextDouble();

        if((checkingBalance-amount)>=0){
            calCheckingWithdraw(amount);
            System.out.println("New Bakance :"+moneyFormat.format(checkingBalance));
            }
        else{
            System.err.println("Balance cannot be negative");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("checking Account balance:" + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw ");
        double amount=sc.nextDouble();

        if((savingBalance-amount)>=0){
            calSavingWithdraw(amount);
            System.out.println("New Bakance :"+moneyFormat.format(savingBalance));
            }
        else{
            System.out.println("Balance cannot be negative");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("checking Account balance:" + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit ");
        double amount=sc.nextDouble();

        if((checkingBalance+amount)>=0){
            calCheckingDeposit(amount);
            System.out.println("New Bakance :"+moneyFormat.format(checkingBalance));
            }
        else{
            System.err.println("Balance cannot be negative");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("checking Account balance:" + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit ");
        double amount=sc.nextDouble();

        if((savingBalance+amount)>=0){
            calSavingDeposit(amount);
            System.out.println("New Bakance :"+moneyFormat.format(savingBalance));
            }
        else{
            System.out.println("Balance cannot be negative");
        }
    }


    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;

}
