
package template.pattern;

/**
 * project name: Design_Pattern
 * package name: template.pattern
 * file name: TemplatePatternDemo.java
 * project version: default
 * Created:
 * Jun 16, 2017, 10:12:47 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/template_pattern.htm
public class TemplatePatternDemo {
   public static void main(String[] args) {

      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();		
   }
}