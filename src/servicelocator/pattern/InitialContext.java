
package servicelocator.pattern;

/**
 * project name: Design_Pattern
 * package name: servicelocator.pattern
 * file name: InitialContext.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:35:43 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm
public class InitialContext {
   public Object lookup(String jndiName){
   
      if(jndiName.equalsIgnoreCase("SERVICE1")){
         System.out.println("Looking up and creating a new Service1 object");
         return new Service1();
      }
      else if (jndiName.equalsIgnoreCase("SERVICE2")){
         System.out.println("Looking up and creating a new Service2 object");
         return new Service2();
      }
      return null;		
   }
}