
package decorator.pattern;

/**
 * project name: Design_Pattern
 * package name: decorator.pattern
 * file name: RedShapeDecorator.java
 * project version: default
 * Created:
 * May 24, 2017, 12:07:22 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}