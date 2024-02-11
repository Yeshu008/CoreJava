//package learning_need;
public class Datatype {
    public static void main(String args[])//sends commands in this form 
    {
        int a=7;
        short b=3;
        long c=98023;
        double d=0.5;
        float e=77.8f;
        boolean f=true;
        char g='A';
        //smaller range variable to longer range variable (impleset conversion)
        long a1=a;
        //explicit data type conversion
        a=(int)a1;
        System.out.println(a);
    }
}
