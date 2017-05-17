
package adapter.pattern;

/**
 * project name: Design_Pattern
 * package name: adapter.pattern
 * file name: MediaAdapter.java
 * project version: default
 * Created:
 * May 17, 2017, 1:07:48 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
   
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();			
         
      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }	
   }

   @Override
   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}