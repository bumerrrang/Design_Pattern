/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.pattern;

/**
 * project name: Design_Pattern
 * package name: builder.pattern
 * file name: Item.java
 * project version: default
 * Created:
 * May 12, 2017, 12:30:44 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
public interface Item {
   public String name();
   public Packing packing();
   public float price();	
}
