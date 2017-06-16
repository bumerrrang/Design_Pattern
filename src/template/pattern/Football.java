
package template.pattern;

/**
 * project name: Design_Pattern
 * package name: template.pattern
 * file name: Football.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:12:05 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/template_pattern.htm
public class Football extends Game {

   @Override
   void endPlay() {
      System.out.println("Football Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Football Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Football Game Started. Enjoy the game!");
   }
}