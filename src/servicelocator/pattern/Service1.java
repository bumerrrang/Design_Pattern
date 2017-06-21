
package servicelocator.pattern;

/**
 * project name: Design_Pattern
 * package name: servicelocator.pattern
 * file name: Service1.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:34:19 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm
public class Service1 implements Service {
   @Override
   public void execute(){
      System.out.println("Executing Service1");
   }

   @Override
   public String getName() {
      return "Service1";
   }
}