package Lesson32;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class SoundEffects {
    private String filePath;
    private File audioFile;
    private AudioInputStream audioIn;
    private Clip clip;
    private boolean loop;

    public SoundEffects(String path) {
       filePath = path;
       clip = null;
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

   public void open() {
       try {
            File audioFile = new File(filePath);
            if (!audioFile.exists()) {
                System.err.println("File not found: " + filePath);
                return;
            }
           AudioInputStream audioIn = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            audioIn.close(); 
       } 
       catch (Exception e) {
            System.err.println("Audio Failed");
            e.printStackTrace();
        }

   }

   public void play() {
       if (clip != null) {
            if (clip.isRunning()) {
                clip.stop();
            }
            clip.setFramePosition(0);
            if (loop) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                clip.start();
            }
        } else {
            System.err.println("Clip is not initialized. Call open() first.");
        }
    }

   public void play(boolean wait) {
       play();
        if (clip != null && wait) {
            long msec = clip.getMicrosecondLength() / 1000;
            new Thread(() -> {
                try {
                    Thread.sleep(msec);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
       }
   }

   public void stop() {
        if (clip != null) {
            clip.stop();
        }
    }

   public void close() {
       if (clip != null) {
           clip.stop();
           clip.close();
       }

   }

} 
