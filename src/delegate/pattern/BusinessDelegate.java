
package delegate.pattern;

/**
 * project name: Design_Pattern
 * package name: delegate.pattern
 * file name: BusinessDelegate.java
 * project version: default
 * Created:
 * Jun 19, 2017, 10:50:33 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
public class BusinessDelegate {
   private BusinessLookUp lookupService = new BusinessLookUp();
   private BusinessService businessService;
   private String serviceType;

   public void setServiceType(String serviceType){
      this.serviceType = serviceType;
   }

   public void doTask(){
      businessService = lookupService.getBusinessService(serviceType);
      businessService.doProcessing();		
   }
}