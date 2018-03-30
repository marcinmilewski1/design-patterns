package patterns.state;

public class PlayingState implements State {

    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        // should stop
        musicPlayer.setState(new StandbyState());
    }
}
