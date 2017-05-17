/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adapter.pattern;

/**
 * project name: Design_Pattern
 * package name: adapter.pattern
 * file name: AdvancedMediaPlayer.java
 * project version: default
 * Created:
 * May 17, 2017, 1:05:23 PM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
public interface AdvancedMediaPlayer {	
   public void playVlc(String fileName);
   public void playMp4(String fileName);
}