//package learning_need;//Comparator<Student> for sorting based on different elemensts
public class Student implements Comparable<Student>{//class is real life entity blueprint of the object which have attributes and behaviour
    int age;
    String name;
    String Address;
    Student(int age,String name,String Address){
        this.age=age;
        this.name=name;
        this.Address=Address;
    }
    public void setnaem(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
   public static void main (String args[]){
        Student s=new Student(8,"Yash","AGB");
        System.out.println(s.toString());
    }
    @Override
    //public int compare(Student o1,Student o2){
    //    if(o1.age<o2.age)return -1   Collections.sort(o,new AgeComparator())
    //}
    public int compareTo(Student o) {
        return this.age-o.age;
        //with this Collections.sort(o) can be used to sort objects
       
    }
}
