
package delegate.pattern;

/**
 * project name: Design_Pattern
 * package name: delegate.pattern
 * file name: BusinessLookUp.java
 * project version: default
 * Created:
 * Jun 19, 2017, 10:49:45 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
public class BusinessLookUp {
   public BusinessService getBusinessService(String serviceType){
   
      if(serviceType.equalsIgnoreCase("EJB")){
         return new EJBService();
      }
      else {
         return new JMSService();
      }
   }
}