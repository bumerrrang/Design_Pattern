
package command.pattern;

/**
 * project name: Design_Pattern
 * package name: command.pattern
 * file name: CommandPatternDemo.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:35:48 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/command_pattern.htm
public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock abcStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);

      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
   }
}