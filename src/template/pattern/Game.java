
package template.pattern;

/**
 * project name: Design_Pattern
 * package name: template.pattern
 * file name: Game.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:10:15 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/template_pattern.htm
public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   //template method
   public final void play(){

      //initialize the game
      initialize();

      //start game
      startPlay();

      //end game
      endPlay();
   }
}