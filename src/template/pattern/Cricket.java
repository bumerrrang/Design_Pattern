
package template.pattern;

/**
 * project name: Design_Pattern
 * package name: template.pattern
 * file name: Cricket.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:11:22 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/template_pattern.htm
public class Cricket extends Game {

   @Override
   void endPlay() {
      System.out.println("Cricket Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
}