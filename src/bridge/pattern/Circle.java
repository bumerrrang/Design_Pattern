
package bridge.pattern;

/**
 * project name: Design_Pattern
 * package name: bridge.pattern
 * file name: Circle.java
 * project version: default
 * Created:
 * May 17, 2017, 1:43:44 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm
public class Circle extends Shape {
   private int x, y, radius;

   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }

   @Override
   public void draw() {
      drawAPI.drawCircle(radius,x,y);
   }
}