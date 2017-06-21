
package servicelocator.pattern;

/**
 * project name: Design_Pattern
 * package name: servicelocator.pattern
 * file name: ServiceLocator.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:37:26 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm
public class ServiceLocator {
   private static Cache cache;

   static {
      cache = new Cache();		
   }

   public static Service getService(String jndiName){

      Service service = cache.getService(jndiName);

      if(service != null){
         return service;
      }

      InitialContext context = new InitialContext();
      Service service1 = (Service)context.lookup(jndiName);
      cache.addService(service1);
      return service1;
   }
}