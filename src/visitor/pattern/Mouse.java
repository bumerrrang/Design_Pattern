
package visitor.pattern;

/**
 * project name: Design_Pattern
 * package name: visitor.pattern
 * file name: Mouse.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:24:25 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
public class Mouse implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}