
package interpreter.pattern;

/**
 * project name: Design_Pattern
 * package name: interpreter.pattern
 * file name: OrExpression.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:43:59 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
public class OrExpression implements Expression {
	 
   private Expression expr1 = null;
   private Expression expr2 = null;

   public OrExpression(Expression expr1, Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }

   @Override
   public boolean interpret(String context) {		
      return expr1.interpret(context) || expr2.interpret(context);
   }
}