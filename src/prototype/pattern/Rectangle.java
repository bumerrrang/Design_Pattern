/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype.pattern;

/**
 * project name: Design_Pattern
 * package name: prototype.pattern
 * file name: Rectangle.java
 * project version: default
 * Created:
 * May 15, 2017, 11:22:50 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
public class Rectangle extends Shape {

   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}