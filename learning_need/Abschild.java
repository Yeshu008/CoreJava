//package learning_need;

public class Abschild extends Abstract {
    void howhello(){
        System.out.println(hello);
    }
    public static void main(String args[]){
        Abstract as=new Abschild();//calls Abstract constructor
        as.howhello();
    }
}
