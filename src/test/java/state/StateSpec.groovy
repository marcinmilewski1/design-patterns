import patterns.state.MusicPlayer
import patterns.state.PlayingState
import patterns.state.StandbyState
import spock.lang.Specification

class StateSpec extends Specification {
    def "Should change states on actions"() {
        given:
        MusicPlayer musicPlayer = new MusicPlayer()

        expect:
        musicPlayer.getState() instanceof StandbyState

        when:
        musicPlayer.tooglePlay()

        then:
        musicPlayer.getState() instanceof PlayingState

        when:
        musicPlayer.tooglePlay()

        then:
        musicPlayer.getState() instanceof StandbyState
    }
}