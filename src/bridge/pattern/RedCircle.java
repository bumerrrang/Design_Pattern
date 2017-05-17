
package bridge.pattern;

/**
 * project name: Design_Pattern
 * package name: bridge.pattern
 * file name: RedCircle.java
 * project version: default
 * Created:
 * May 17, 2017, 1:39:33 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm
public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}