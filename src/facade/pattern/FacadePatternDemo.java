
package facade.pattern;

/**
 * project name: Design_Pattern
 * package name: facade.pattern
 * file name: FacadePatternDemo.java
 * project version: default
 * Created:
 * May 26, 2017, 10:09:36 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();		
   }
}