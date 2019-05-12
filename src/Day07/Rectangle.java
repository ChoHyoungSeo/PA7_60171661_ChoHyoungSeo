package Day07;

public class Rectangle extends Shape{
   double h,i;
   public void draw(){
      System.out.println();
   }
   public Rectangle(double x, double y, double h, double i) {
      super(x,y);
      this.h = h;
      this.i = i;
      
   }
   public double getArea() {
      double area = h*i;
      return area;
   }
   public double getlength() {
      double length = 2*(h+i);
      return length;
   }
}