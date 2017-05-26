
package flyweight.pattern;

import java.util.HashMap;

/**
 * project name: Design_Pattern
 * package name: flyweight.pattern
 * file name: ShapeFactory.java
 * project version: default
 * Created:
 * May 26, 2017, 10:18:14 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm
public class ShapeFactory {
   private static final HashMap<String, Shape> circleMap = new HashMap();

   public static Shape getCircle(String color) {
      Circle circle = (Circle)circleMap.get(color);

      if(circle == null) {
         circle = new Circle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}