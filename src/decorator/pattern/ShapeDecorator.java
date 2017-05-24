
package decorator.pattern;

/**
 * project name: Design_Pattern
 * package name: decorator.pattern
 * file name: ShapeDecorator.java
 * project version: default
 * Created:
 * May 24, 2017, 12:06:28 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   @Override
   public void draw(){
      decoratedShape.draw();
   }	
}