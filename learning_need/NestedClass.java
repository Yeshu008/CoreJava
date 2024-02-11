//package learning_need;

public class NestedClass {
    String name="helllo";
    //inner class can be static
    ////NestedClass.inside x=new NestedClass.inside()
    public class inside{
        void ppp(){
            System.out.println(name);
        }
    }
}
//objects of innerclass are made 
//NestedClass.inside x=new NestedClass().new inside()