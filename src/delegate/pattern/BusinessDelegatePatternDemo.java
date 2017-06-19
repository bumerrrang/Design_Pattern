
package delegate.pattern;

/**
 * project name: Design_Pattern
 * package name: delegate.pattern
 * file name: BusinessDelegatePatternDemo.java
 * project version: default
 * Created:
 * Jun 19, 2017, 10:52:23 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
public class BusinessDelegatePatternDemo {
	
   public static void main(String[] args) {

      BusinessDelegate businessDelegate = new BusinessDelegate();
      businessDelegate.setServiceType("EJB");

      Client client = new Client(businessDelegate);
      client.doTask();

      businessDelegate.setServiceType("JMS");
      client.doTask();
   }
}