package solid;

import java.util.ArrayList;
import java.util.List;

public class ChannelContent implements  ChannelDashBoard{
    List<String> yourVideos = new ArrayList<>();
    @Override
    public void uploadVideo(String newVideo) {
        yourVideos.add(newVideo);
    }

    @Override
    public void yourVideos() {
        int slno=0;
        for(String video : yourVideos){
            slno++;
            System.out.println(slno +" "+ video);
        }
    }
}
