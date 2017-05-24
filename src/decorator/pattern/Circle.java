
package decorator.pattern;

/**
 * project name: Design_Pattern
 * package name: decorator.pattern
 * file name: Circle.java
 * project version: default
 * Created:
 * May 24, 2017, 12:05:51 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}