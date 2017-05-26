
package flyweight.pattern;

/**
 * project name: Design_Pattern
 * package name: flyweight.pattern
 * file name: Circle.java
 * project version: default
 * Created:
 * May 26, 2017, 10:17:31 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm
public class Circle implements Shape {
   private String color;
   private int x;
   private int y;
   private int radius;

   public Circle(String color){
      this.color = color;		
   }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      this.y = y;
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }

   @Override
   public void draw() {
      System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
   }
}