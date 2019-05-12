package Day07;

public class Circle extends Shape{
   double radius;
   public void draw(){
      
   }
   public Circle(double x, double y, double radious) {
      super(x,y);
      this.radius = radious;
   }
   public double getArea() {
      double area = (3.14)*(radius*radius);
      return area;
   }
   public double getlength() {
      double length = (3.14)*(2*radius);
      return length;
   }
}