
package bridge.pattern;

/**
 * project name: Design_Pattern
 * package name: bridge.pattern
 * file name: GreenCircle.java
 * project version: default
 * Created:
 * May 17, 2017, 1:40:38 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm
public class GreenCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}