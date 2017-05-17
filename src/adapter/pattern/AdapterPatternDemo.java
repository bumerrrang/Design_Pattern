
package adapter.pattern;

/**
 * project name: Design_Pattern
 * package name: adapter.pattern
 * file name: AdapterPatternDemo.java
 * project version: default
 * Created:
 * May 17, 2017, 1:10:24 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();

      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}