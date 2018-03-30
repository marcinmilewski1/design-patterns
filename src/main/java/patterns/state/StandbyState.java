package patterns.state;

public class StandbyState implements State {
    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        musicPlayer.setState(new PlayingState());
    }
}
