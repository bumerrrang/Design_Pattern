
package decorator.pattern;

/**
 * project name: Design_Pattern
 * package name: decorator.pattern
 * file name: Rectangle.java
 * project version: default
 * Created:
 * May 24, 2017, 12:05:02 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}