package baitap3.ra;

public class VideoPlayer implements Playable {

    @Override
    public void play(String s) {

        System.out.println("VideoPlayer play ...." + s);
    }
}
