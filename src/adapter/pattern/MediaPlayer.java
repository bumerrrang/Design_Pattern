
package adapter.pattern;

/**
 * project name: Design_Pattern
 * package name: adapter.pattern
 * file name: MediaPlayer.java
 * project version: default
 * Created:
 * May 17, 2017, 1:03:23 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
public interface MediaPlayer {
   public void play(String audioType, String fileName);
}