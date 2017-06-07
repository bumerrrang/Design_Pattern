
package mediator.pattern;

/**
 * project name: Design_Pattern
 * package name: mediator.pattern
 * file name: MediatorPatternDemo.java
 * project version: default
 * Created:
 * Jun 7, 2017, 9:23:05 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}