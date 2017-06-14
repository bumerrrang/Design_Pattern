
package strategy.pattern;

/**
 * project name: Design_Pattern
 * package name: strategy.pattern
 * file name: OperationMultiply.java
 * project version: default
 * Created:
 * Jun 14, 2017, 10:20:50 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
public class OperationMultiply implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}