/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractt.factory.pattern;

/**
 * project name: Design_Pattern
 * package name: abstractt.factory.pattern
 * file name: FactoryProducer.java
 * project version: default
 * Created:
 * May 10, 2017, 12:48:48 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
         
      }else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      
      return null;
   }
}