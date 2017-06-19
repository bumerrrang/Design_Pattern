
package delegate.pattern;

/**
 * project name: Design_Pattern
 * package name: delegate.pattern
 * file name: EJBService.java
 * project version: default
 * Created:
 * Jun 19, 2017, 10:47:43 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
public class EJBService implements BusinessService {

   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking EJB Service");
   }
}