package patterns.state;

public class MusicPlayer {
    private State state = new StandbyState();

    public void tooglePlay() {
        state.pressPlay(this);
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }
}
