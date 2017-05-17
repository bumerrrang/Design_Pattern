/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype.pattern;

/**
 * project name: Design_Pattern
 * package name: prototype.pattern
 * file name: Shape.java
 * project version: default
 * Created:
 * May 15, 2017, 11:20:36 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
public abstract class Shape implements Cloneable {   
   private String id;
   protected String type;
   
   abstract void draw();
   
   public String getType(){
      return type;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   
   @Override
   public Object clone() throws CloneNotSupportedException {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
      }
      
      return clone;
   }
}