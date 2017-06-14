
package state.pattern;

/**
 * project name: Design_Pattern
 * package name: state.pattern
 * file name: StartState.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:23:22 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/state_pattern.htm
public class StartState implements State {

   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this);	
   }

   public String toString(){
      return "Start State";
   }
}