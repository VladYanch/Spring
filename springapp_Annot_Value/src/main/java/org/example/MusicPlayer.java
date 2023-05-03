package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;


    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }



    public void playMusic(MusicGerne gerne) {

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (gerne == MusicGerne.CLASSICAL)
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        else
            System.out.println(rockMusic.getSongs().get(randomNumber));
    }
}
