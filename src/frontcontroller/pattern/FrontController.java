
package frontcontroller.pattern;

/**
 * project name: Design_Pattern
 * package name: frontcontroller.pattern
 * file name: FrontController.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:32:57 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/front_controller_pattern.htm
public class FrontController {
	
   private Dispatcher dispatcher;

   public FrontController(){
      dispatcher = new Dispatcher();
   }

   private boolean isAuthenticUser(){
      System.out.println("User is authenticated successfully.");
      return true;
   }

   private void trackRequest(String request){
      System.out.println("Page requested: " + request);
   }

   public void dispatchRequest(String request){
      //log each request
      trackRequest(request);
      
      //authenticate the user
      if(isAuthenticUser()){
         dispatcher.dispatch(request);
      }	
   }
}