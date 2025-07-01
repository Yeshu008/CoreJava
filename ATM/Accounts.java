package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;

    Scanner input =new Scanner(System.in);
    DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");
    
    public int setCustomerNumber(int string){
        this.customerNumber=string;
        return string;
    }
    public int setPinNumber(int string){
        this.pinNumber=string;
        return string;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingBalance=(savingBalance+amount);
        return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("checking balance"+moneyFormat.format(getCheckingBalance()));
        System.out.println("amount u want to withdraw:");
        double amount =input.nextDouble();
        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);;
            System.out.println("new checking balance"+moneyFormat.format(getCheckingBalance()));
        }else{
            System.out.println("not enough balacne \n");
        }
    }
    public void getSavingWithdrawInput(){
        System.out.println("checking balance"+moneyFormat.format(getSavingBalance()));
        System.out.println("amount u want to withdraw:");
        double amount =input.nextDouble();
        if((savingBalance-amount)>=0){
            calcSavingWithdraw(amount);;
            System.out.println("new checking balance"+moneyFormat.format(getSavingBalance()));
        }else{
            System.out.println("not enough balacne \n");
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("checking balance"+moneyFormat.format(getCheckingBalance()));
        System.out.println("amount u want to deposit:");
        double amount =input.nextDouble();
        if((checkingBalance+amount)>=0){
            calcCheckingWithdraw(amount);;
            System.out.println("new checking balance"+moneyFormat.format(getCheckingBalance()));
        }else{
            System.out.println("not enough balacne \n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("checking balance"+moneyFormat.format(getSavingBalance()));
        System.out.println("amount u want to deposit:");
        double amount =input.nextDouble();
        if((savingBalance+amount)>=0){
            calcSavingWithdraw(amount);;
            System.out.println("new checking balance"+moneyFormat.format(getSavingBalance()));
        }else{
            System.out.println("not enough balacne \n");
        }
    }

}
