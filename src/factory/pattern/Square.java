
package factory.pattern;

/**
 * project name: Design_Pattern
 * package name: factory.pattern
 * file name: Square.java
 * project version: default
 * Created:
 * May 10, 2017, 12:30:54 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}