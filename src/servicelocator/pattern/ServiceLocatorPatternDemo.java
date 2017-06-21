
package servicelocator.pattern;

/**
 * project name: Design_Pattern
 * package name: servicelocator.pattern
 * file name: ServiceLocatorPatternDemo.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:38:19 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm
public class ServiceLocatorPatternDemo {
   public static void main(String[] args) {
      Service service = ServiceLocator.getService("Service1");
      service.execute();
      service = ServiceLocator.getService("Service2");
      service.execute();
      service = ServiceLocator.getService("Service1");
      service.execute();
      service = ServiceLocator.getService("Service2");
      service.execute();		
   }
}