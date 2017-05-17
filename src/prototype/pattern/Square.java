/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype.pattern;

/**
 * project name: Design_Pattern
 * package name: prototype.pattern
 * file name: Square.java
 * project version: default
 * Created:
 * May 15, 2017, 11:24:08 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
public class Square extends Shape {

   public Square(){
     type = "Square";
   }

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}