/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype.pattern;

/**
 * project name: Design_Pattern
 * package name: prototype.pattern
 * file name: PrototypePatternDemo.java
 * project version: default
 * Created:
 * May 15, 2017, 11:29:41 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
public class PrototypePatternDemo {
   public static void main(String[] args) throws CloneNotSupportedException {
      ShapeCache.loadCache();

      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape.getType());		

      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());		

      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());		
   }
}
