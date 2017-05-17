
package adapter.pattern;

/**
 * project name: Design_Pattern
 * package name: adapter.pattern
 * file name: Mp4Player.java
 * project version: default
 * Created:
 * May 17, 2017, 1:07:06 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
public class Mp4Player implements AdvancedMediaPlayer{

   @Override
   public void playVlc(String fileName) {
      //do nothing
   }

   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);		
   }
}