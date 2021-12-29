package solid;

import java.util.ArrayList;
import java.util.List;

public class StudyPlaylist implements Playlists{
    int videoCount=0;
    List<String> study = new ArrayList<>();
    @Override
    public int getVideosCount() {
        return videoCount;
    }
    @Override
    public void addVideos(String videoName) {
        study.add(videoName);
        videoCount++;
    }
    @Override
    public void showVideos() {
            int slno=0;
            for(String studyVideo : study){
                slno++;
                System.out.println(slno +" "+studyVideo);
            }
    }
}
