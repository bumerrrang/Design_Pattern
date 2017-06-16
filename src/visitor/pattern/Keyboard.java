
package visitor.pattern;

/**
 * project name: Design_Pattern
 * package name: visitor.pattern
 * file name: Keyboard.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:21:38 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
public class Keyboard implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}