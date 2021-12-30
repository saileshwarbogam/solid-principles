package solid;

import java.util.concurrent.CopyOnWriteArrayList;

public class Youtube {
    public static void main(String[] args) {

        NormalUser user1 = new NormalUser();
        user1.register("sailesh","1729");
        user1.login("sailesh","1729");
        user1.userType();
        Advertisements ads = new Advertisements();
        ads.showAdds(user1);

        Payment payment = new CardPayment();
        payment.makePayment();



        Playlists musicList = new MusicPlaylist();
        musicList.addVideos("Perfect by Ed Sheeran");
        musicList.addVideos("Dancing on my own by Calum");
        musicList.addVideos("It's you by Ali Gatie");
        musicList.getVideosCount();
        musicList.showVideos();

        Playlists studyList = new StudyPlaylist();
        studyList.addVideos("Java Tutorial");
        studyList.addVideos("React Tutorial");
        studyList.getVideosCount();
        studyList.showVideos();
        int age = 10;
        if(age < 10){
            Recommendations suggestions = new Kids();
            suggestions.showContent();
        }
        age = 22;
        if(age < 25 && age>=18){
            Recommendations suggestions = new Teenage();
            suggestions.showContent();
        }

    }
}
