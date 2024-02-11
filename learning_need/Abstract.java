//package learning_need;

public abstract class Abstract {
    int hello;
    abstract void howhello();
    void print(){
        System.out.println(hello);
       //can have concret method but interface cannot have
        /*interface variables  has to be initialized public static int a=0*/
    }
}
