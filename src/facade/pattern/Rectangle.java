
package facade.pattern;

/**
 * project name: Design_Pattern
 * package name: facade.pattern
 * file name: Rectangle.java
 * project version: default
 * Created:
 * May 26, 2017, 10:06:55 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}