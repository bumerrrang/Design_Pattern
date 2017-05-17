
package factory.pattern;

/**
 * project name: Design_Pattern
 * package name: factory.pattern
 * file name: ShapeFactory.java
 * project version: default
 * Created:
 * May 10, 2017, 12:33:46 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
public class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CYCLE")){
         return new Cycle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}