/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton.pattern;

/**
 * project name: Design_Pattern
 * package name: singleton.pattern
 * file name: SingleObject.java
 * project version: default
 * Created:
 * May 12, 2017, 12:23:49 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
public class SingleObject {
   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
