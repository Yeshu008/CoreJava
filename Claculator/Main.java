package Claculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
        public static void main(String args[]){
            final String inputExp=ReadInput.read();

            Queue<String> operations;
            Queue<String> numbers;

            String numbersArr[]=inputExp.split("[+-*/]");
            String opArr[]=inputExp.split("[0-9]+");

            operations =new LinkedList<>(Arrays.asList(numbersArr));
            numbers =new LinkedList<>(Arrays.asList(opArr));

            Double res=Double.parseDouble(numbers.poll());
            while(!numbers.isEmpty()){
                String opr =operations.poll();
                Operator operator;
                switch(opr){
                    case "+":
                        operator=new Add();
                        break;
                    case "-":
                        operator=new Sub();
                        break;
                    case "*":
                        operator=new Multiply();
                        break;
                    case "/":
                        operator=new Divide();
                        break;
                    default:
                        continue;
                }
                Double num=Double.parseDouble(numbers.poll());
               res=operator.getResult(num,res);
            }
            System.out.println(res);
        }
}
