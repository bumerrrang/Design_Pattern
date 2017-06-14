
package nullobject.pattern;

/**
 * project name: Design_Pattern
 * package name: nullobject.pattern
 * file name: NullPatternDemo.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:38:31 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
public class NullPatternDemo {
   public static void main(String[] args) {

      AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
      AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
      AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
      AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

      System.out.println("Customers");
      System.out.println(customer1.getName());
      System.out.println(customer2.getName());
      System.out.println(customer3.getName());
      System.out.println(customer4.getName());
   }
}