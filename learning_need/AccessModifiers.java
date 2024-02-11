//package learning_need;

public class AccessModifiers {
    //en capsulation making properties of class not accesable to outside world
    //make protected to private to acces give getter method
  protected int gear;
  protected int speed;
   AccessModifiers(int gear,int speed){
    this.gear=gear;
    this.speed=speed;
   }
   public int decrease(int d){
    return speed-d;
   }
}
