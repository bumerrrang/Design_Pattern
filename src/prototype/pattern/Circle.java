/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype.pattern;

/**
 * project name: Design_Pattern
 * package name: prototype.pattern
 * file name: Sicle.java
 * project version: default
 * Created:
 * May 15, 2017, 11:25:04 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
public class Circle extends Shape {

   public Circle(){
     type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}