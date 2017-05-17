
package adapter.pattern;

/**
 * project name: Design_Pattern
 * package name: adapter.pattern
 * file name: VlcPlayer.java
 * project version: default
 * Created:
 * May 17, 2017, 1:06:20 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
public class VlcPlayer implements AdvancedMediaPlayer{
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);		
   }

   @Override
   public void playMp4(String fileName) {
      //do nothing
   }
}