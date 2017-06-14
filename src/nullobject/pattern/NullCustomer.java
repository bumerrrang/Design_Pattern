
package nullobject.pattern;

/**
 * project name: Design_Pattern
 * package name: nullobject.pattern
 * file name: NullCustomer.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:33:02 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
public class NullCustomer extends AbstractCustomer {

   @Override
   public String getName() {
      return "Not Available in Customer Database";
   }

   @Override
   public boolean isNil() {
      return true;
   }
}