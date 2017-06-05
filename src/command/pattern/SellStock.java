
package command.pattern;

/**
 * project name: Design_Pattern
 * package name: command.pattern
 * file name: SellStock.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:33:46 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/command_pattern.htm
public class SellStock implements Order {
   private Stock abcStock;

   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   @Override
   public void execute() {
      abcStock.sell();
   }
}