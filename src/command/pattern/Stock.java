
package command.pattern;

/**
 * project name: Design_Pattern
 * package name: command.pattern
 * file name: Stock.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:30:32 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/command_pattern.htm
public class Stock {
   private String name = "ABC";
   private int quantity = 10;

   public void buy(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
   }
   public void sell(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
   }
}
