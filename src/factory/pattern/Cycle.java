
package factory.pattern;

/**
 * project name: Design_Pattern
 * package name: factory.pattern
 * file name: Cycle.java
 * project version: default
 * Created:
 * May 10, 2017, 12:31:40 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
public class Cycle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Cycle::draw() method.");
   }
}