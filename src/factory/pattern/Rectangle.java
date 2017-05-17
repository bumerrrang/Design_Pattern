
package factory.pattern;

/**
 * project name: Design_Pattern
 * package name: factory.pattern
 * file name: Rectangle.java
 * project version: default
 * Created:
 * May 10, 2017, 12:29:59 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}