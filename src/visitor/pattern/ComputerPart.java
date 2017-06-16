
package visitor.pattern;

/**
 * project name: Design_Pattern
 * package name: visitor.pattern
 * file name: ComputerPart.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:20:55 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}