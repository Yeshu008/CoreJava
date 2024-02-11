//package learning_need;
//multiple inheritance is not possible is overcome by implementing the interface
//cannot overide a static method in super class in subclass
public class Inheritance extends AccessModifiers {
    int seathight;
    static int count=0;//belongs to class access as Inheritance.count
    Inheritance(int gear,int speed,int seathight)
    {   
        super(gear, speed);
        this.seathight=seathight;
    }
}
