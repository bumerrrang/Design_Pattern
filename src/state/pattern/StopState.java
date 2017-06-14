
package state.pattern;

/**
 * project name: Design_Pattern
 * package name: state.pattern
 * file name: StopState.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:24:26 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/state_pattern.htm
public class StopState implements State {

   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this);	
   }

   public String toString(){
      return "Stop State";
   }
}