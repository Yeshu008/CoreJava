package Claculator;

public class Multiply implements Operator {
    public Double getResult(Double... numbers) {
        Double result=1.0;
        for(Double num:numbers){
            result*=num;
        }
        return result;
    }
}
