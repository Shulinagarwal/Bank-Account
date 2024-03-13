import java.util.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.text.DecimalFormat;
public class OptionMenu extends Account{
    Scanner sc=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();

    public void getLogin()throws IOException{
        int x=1;
        do{
            try{
                data.put(9876543, 9876);
                data.put(8989889, 1890);

                System.out.println("Welcome to My ATM project");

                System.out.print("Enter your customer Number");
                setCustomerNumber(sc.nextInt());

                System.out.print("Enter your pin");
                setPinNumber(sc.nextInt());
                
            } catch(Exception e){
                System.out.println("\n"+"Wrong Customer Number or Pin number");
                x=2;
            }
            for(Entry<Integer,Integer> entry : data.entrySet()){
                if(entry.getKey()==getCustomerNumber()&& entry.getValue()==getPinNumber()){
                    getAccountType();
                }
            }
        }while(x==1);
    }
        //Display account type
        public void getAccountType(){
           
            System.out.println("Select the account you want to access:");
            System.out.println("Type 1-Checking Account");
            System.out.println("Type 2- Saving Account");
            System.out.println("Type 3-Exit");

            int selection=sc.nextInt();

            switch(selection){
                case 1:
                getChecking();
                break;
                
                case 2:
                getSaving();
                break;
                
                case 3:
                System.out.println("Thank you for using this atm");
                break;
                
                default:
                System.out.println("Invalid choice");
                getAccountType();
            }
        }

        public void getChecking(){
            System.out.println("Checking Account:");
            System.out.println("Type 1-view Balance");
            System.out.println("Type 2-Withdraw funds");
            System.out.println("Type 3-Deposite Funds");
            System.out.println("Type 4- Exit");
            System.out.print("Choice:");

            int selection=sc.nextInt();

            switch(selection){
                case 1:
                System.out.println("Current balance:"+moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

                case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

                case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

                case 4:
                System.out.println("Thank you for using this atm");
                break;

                default:
                System.out.println("Wrong choice");
                getChecking();
                

            }

        }

        public void getSaving(){
            System.out.println("Saving Account:");
            System.out.println("Type 1-view Balance");
            System.out.println("Type 2-Withdraw funds");
            System.out.println("Type 3-Deposite Funds");
            System.out.println("Type 4- Exit");
            System.out.print("Choice:");

            int selection=sc.nextInt();

            switch(selection){
                case 1:
                System.out.println("Current balance:"+moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

                case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

                case 3:
                getSavingDepositInput();
                getAccountType();
                break;

                case 4:
                System.out.println("Thank you for using this atm");
                break;

                default:
                System.out.println("Wrong choice");
                getChecking();
                

            }

        }
    }
