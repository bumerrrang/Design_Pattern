
package command.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * project name: Design_Pattern
 * package name: command.pattern
 * file name: Broker.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:34:32 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/command_pattern.htm
   public class Broker {
   private List<Order> orderList = new ArrayList<Order>(); 

   public void takeOrder(Order order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}