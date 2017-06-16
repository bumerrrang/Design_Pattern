
package visitor.pattern;

/**
 * project name: Design_Pattern
 * package name: visitor.pattern
 * file name: VisitorPatternDemo.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:30:39 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
public class VisitorPatternDemo {
   public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}