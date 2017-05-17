
package factory.pattern;

/**
 * project name: Design_Pattern
 * package name: factory.pattern
 * file name: FactoryPatternDemo.java
 * project version: default
 * Created:
 * May 10, 2017, 12:35:18 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its draw method.
      Shape shape1 = shapeFactory.getShape("CYCLE");

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call draw method of circle
      shape3.draw();
   }
}