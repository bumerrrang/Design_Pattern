
package nullobject.pattern;

/**
 * project name: Design_Pattern
 * package name: nullobject.pattern
 * file name: RealCustomer.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:32:26 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
public class RealCustomer extends AbstractCustomer {

   public RealCustomer(String name) {
      this.name = name;		
   }
   
   @Override
   public String getName() {
      return name;
   }
   
   @Override
   public boolean isNil() {
      return false;
   }
}