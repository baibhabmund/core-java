public interface Playable {
    public void play();
    public static void main(String args[]){
        Playable videoplayer = new videoPlayer();
        Playable audioplayer = new audioPlayer();

        videoplayer.play();
        audioplayer.play();
    }
}
class videoPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("Play Video");
    }
}
class audioPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("Play Audio");
    }
}

