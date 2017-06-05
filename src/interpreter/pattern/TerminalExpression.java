
package interpreter.pattern;

/**
 * project name: Design_Pattern
 * package name: interpreter.pattern
 * file name: TerminalExpression.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:43:14 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
public class TerminalExpression implements Expression {
	
   private String data;

   public TerminalExpression(String data){
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {
   
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}