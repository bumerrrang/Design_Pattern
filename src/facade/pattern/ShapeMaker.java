
package facade.pattern;

/**
 * project name: Design_Pattern
 * package name: facade.pattern
 * file name: ShapeMaker.java
 * project version: default
 * Created:
 * May 26, 2017, 10:08:45 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}