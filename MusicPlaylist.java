package solid;

import java.util.ArrayList;
import java.util.List;

public class MusicPlaylist implements Playlists{
    List<String> music = new ArrayList<>();
    int videoCount=0;
    @Override
    public int getVideosCount() {
        return videoCount;
    }
    @Override
    public void addVideos(String videoName) {
        music.add(videoName);
        videoCount++;
    }
    @Override
    public void showVideos() {
        int slno=0;
        for(String musicVideo : music){
            slno++;
            System.out.println(slno +" " +musicVideo);
        }
    }
}
