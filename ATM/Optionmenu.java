package ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Optionmenu extends Accounts {
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data =new HashMap<Integer,Integer>();

    public void getLogin() throws IOException{
        int x=1;
        do {
            try{
                data.put(9543,1919);
                data.put(9983,1916);
                
                System.out.println("Welcome to the Atm !");
                System.out.println("enter yout customer number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter ur pin");
                setPinNumber(menuInput.nextInt());
            }catch(Exception e){
                System.out.println("\n invalid characters only numbers");
                x=2;
            }
            int cn =getCustomerNumber();
            int pn =getPinNumber();
            if(data.containsKey(cn)&&data.get(cn)==pn ){
                getAccountType();
            }
            else{
                System.out.println("\n wrong customer");
            }
            }while(x==1);
    }
    public void getAccountType(){
        System.out.println("select the account u want: ");
        System.out.println("type 1-checking account");
        System.out.println("type 2 saving account");
        System.out.println("type 3 exit");

        int selection =menuInput.nextInt();
        switch(selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("thanks for using");
                break;
            default:
                System.out.println("\ninvalid choice");
        }
    }
    public void getChecking(){
        System.out.println("Checking account");
        System.out.println("type 1 view balance");
        System.out.println("type 2 withdraw funds");
        System.out.println("type 3 Deposit funds");
        System.out.println("tyepe 4 exit");
        System.out.print("choice");
        int selection =menuInput.nextInt();
        switch(selection){
            case 1:
                System.out.println("checking balance"+moneyFormat.format(getCheckingBalance()));
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
                System.out.println("thanks for using");
                break;
            default:
                System.out.println("\ninvalid choice");
        }
    }
    public void getSaving(){
        System.out.println("Checking account");
        System.out.println("type 1 view balance");
        System.out.println("type 2 withdraw funds");
        System.out.println("type 3 Deposit funds");
        System.out.println("tyepe 4 exit");
        System.out.print("choice");
        int selection =menuInput.nextInt();
        switch(selection){
            case 1:
                System.out.println("checking balance"+moneyFormat.format(getSavingBalance()));
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
                System.out.println("thanks for using");
                break;
            default:
                System.out.println("\ninvalid choice");
        }
    }
}
