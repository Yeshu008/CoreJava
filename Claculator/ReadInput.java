package Claculator;

import java.util.Scanner;

public class ReadInput {
    public static  String read(){
        Scanner sc=new Scanner(System.in);
    
        System.out.print("enter the expression like 5*3/4");
    
        String inputline=sc.nextLine();
    
        sc.close();
        return inputline;
    }
}
