package baitap3.ra;

public class AudioPlayer implements Playable {

    @Override
    public void play(String s) {

        System.out.println("đang phát audio ... " + s );
    }
}
