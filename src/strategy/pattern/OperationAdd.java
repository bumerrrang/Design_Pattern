
package strategy.pattern;

/**
 * project name: Design_Pattern
 * package name: strategy.pattern
 * file name: OperationAdd.java
 * project version: default
 * Created:
 * Jun 14, 2017, 10:19:26 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
}