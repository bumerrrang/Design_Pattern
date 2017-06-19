
package delegate.pattern;

/**
 * project name: Design_Pattern
 * package name: delegate.pattern
 * file name: Client.java
 * project version: default
 * Created:
 * Jun 19, 2017, 10:51:12 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
public class Client {
	
   BusinessDelegate businessService;

   public Client(BusinessDelegate businessService){
      this.businessService  = businessService;
   }

   public void doTask(){		
      businessService.doTask();
   }
}