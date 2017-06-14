
package strategy.pattern;

/**
 * project name: Design_Pattern
 * package name: strategy.pattern
 * file name: StrategyPatternDemo.java
 * project version: default
 * Created:
 * Jun 14, 2017, 10:22:09 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}