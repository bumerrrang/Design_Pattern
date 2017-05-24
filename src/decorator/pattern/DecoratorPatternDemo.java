
package decorator.pattern;

/**
 * project name: Design_Pattern
 * package name: decorator.pattern
 * file name: DecoratorPatternDemo.java
 * project version: default
 * Created:
 * May 24, 2017, 12:08:09 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}