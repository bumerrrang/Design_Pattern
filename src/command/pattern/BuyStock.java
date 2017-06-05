
package command.pattern;

/**
 * project name: Design_Pattern
 * package name: command.pattern
 * file name: BuyStock.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:32:51 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/command_pattern.htm
public class BuyStock implements Order {
   private Stock abcStock;

   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   @Override
   public void execute() {
      abcStock.buy();
   }
}