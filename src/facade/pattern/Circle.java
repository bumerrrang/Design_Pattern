
package facade.pattern;

/**
 * project name: Design_Pattern
 * package name: facade.pattern
 * file name: Circle.java
 * project version: default
 * Created:
 * May 26, 2017, 10:08:07 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Circle::draw()");
   }
}