
package bridge.pattern;

/**
 * project name: Design_Pattern
 * package name: bridge.pattern
 * file name: BridgePatternDemo.java
 * project version: default
 * Created:
 * May 17, 2017, 1:46:07 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm
public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

      redCircle.draw();
      greenCircle.draw();
   }
}