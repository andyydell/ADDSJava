package AO3;

import javax.sound.sampled.LineUnavailableException;

import AO3.ToneGenerator.Note;

public class TwinkleTwinkle {
    public static void main(String[] args) throws LineUnavailableException {
       ToneGenerator tg = new ToneGenerator();
       tg.init();
       tg.play(Note.C4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.C4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.G4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.G4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.A4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.A4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.G4, 400);
       tg.play(Note.REST, 50);
       tg.play(Note.F4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.F4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.E4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.E4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.D4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.D4, 200);
       tg.play(Note.REST, 50);
       tg.play(Note.C4, 200);
       tg.play(Note.REST, 50);
       tg.close();
   }

}
