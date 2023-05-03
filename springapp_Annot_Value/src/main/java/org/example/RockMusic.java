package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind of change");
        songs.add("Wind cries Mary");
        songs.add("Wall");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}

