/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton.pattern;

/**
 * project name: Design_Pattern
 * package name: singleton.pattern
 * file name: SingletonPatternDemo.java
 * project version: default
 * Created:
 * May 12, 2017, 12:25:20 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
public class SingletonPatternDemo {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();
   }
}
