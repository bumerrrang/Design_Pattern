
package bridge.pattern;

/**
 * project name: Design_Pattern
 * package name: bridge.pattern
 * file name: Shape.java
 * project version: default
 * Created:
 * May 17, 2017, 1:42:53 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm
public abstract class Shape {
   protected DrawAPI drawAPI;
   
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();	
}