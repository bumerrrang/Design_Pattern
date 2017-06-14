
package state.pattern;

/**
 * project name: Design_Pattern
 * package name: state.pattern
 * file name: StatePatternDemo.java
 * project version: default
 * Created:
 * Jun 14, 2017, 9:25:57 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/state_pattern.htm
public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
   }
}