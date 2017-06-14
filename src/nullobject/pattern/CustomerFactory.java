
package nullobject.pattern;

/**
 * project name: Design_Pattern
 * package name: nullobject.pattern
 * file name: CustomerFactory.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:33:51 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
public class CustomerFactory {
	
   public static final String[] names = {"Rob", "Joe", "Julie"};

   public static AbstractCustomer getCustomer(String name){
   
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RealCustomer(name);
         }
      }
      return new NullCustomer();
   }
}