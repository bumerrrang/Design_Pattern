
package strategy.pattern;

/**
 * project name: Design_Pattern
 * package name: strategy.pattern
 * file name: Context.java
 * project version: default
 * Created:
 * Jun 14, 2017, 10:21:23 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}