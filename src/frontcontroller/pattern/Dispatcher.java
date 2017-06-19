
package frontcontroller.pattern;

/**
 * project name: Design_Pattern
 * package name: frontcontroller.pattern
 * file name: Dispatcher.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:32:15 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/front_controller_pattern.htm
public class Dispatcher {
   private StudentView studentView;
   private HomeView homeView;
   
   public Dispatcher(){
      studentView = new StudentView();
      homeView = new HomeView();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("STUDENT")){
         studentView.show();
      }
      else{
         homeView.show();
      }	
   }
}