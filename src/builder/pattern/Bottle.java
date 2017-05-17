/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.pattern;

/**
 * project name: Design_Pattern
 * package name: builder.pattern
 * file name: Bottle.java
 * project version: default
 * Created:
 * May 12, 2017, 12:34:30 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
public class Bottle implements Packing {
   @Override
   public String pack() {
      return "Bottle";
   }
}
