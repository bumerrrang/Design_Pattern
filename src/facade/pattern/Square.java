
package facade.pattern;

/**
 * project name: Design_Pattern
 * package name: facade.pattern
 * file name: Square.java
 * project version: default
 * Created:
 * May 26, 2017, 10:07:31 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}