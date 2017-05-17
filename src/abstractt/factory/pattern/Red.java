/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractt.factory.pattern;

/**
 * project name: Design_Pattern
 * package name: abstractt.factory.pattern
 * file name: Red.java
 * project version: default
 * Created:
 * May 10, 2017, 12:44:38 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
public class Red implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}
