
package frontcontroller.pattern;

/**
 * project name: Design_Pattern
 * package name: frontcontroller.pattern
 * file name: FrontControllerPatternDemo.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:33:52 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/front_controller_pattern.htm
public class FrontControllerPatternDemo {
   public static void main(String[] args) {
   
      FrontController frontController = new FrontController();
      frontController.dispatchRequest("HOME");
      frontController.dispatchRequest("STUDENT");
   }
}