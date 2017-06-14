
package state.pattern;

/**
 * project name: Design_Pattern
 * package name: state.pattern
 * file name: Context.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:25:07 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/state_pattern.htm
public class Context {
   private State state;

   public Context(){
      state = null;
   }

   public void setState(State state){
      this.state = state;		
   }

   public State getState(){
      return state;
   }
}