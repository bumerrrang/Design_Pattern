
package visitor.pattern;

/**
 * project name: Design_Pattern
 * package name: visitor.pattern
 * file name: Computer.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:22:58 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
public class Computer implements ComputerPart {
	
   ComputerPart[] parts;

   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};		
   } 


   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}