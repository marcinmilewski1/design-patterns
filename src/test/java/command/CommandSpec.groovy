import patterns.command.Command
import patterns.command.Light
import patterns.command.SwitchOffCommand
import patterns.command.SwitchOnCommand
import spock.lang.Specification

class CommandSpec extends Specification {

    Light light
    Command turnOnCommand
    Command turnOffCommand
    def setup() {
        light = Mock()
        turnOnCommand = new SwitchOnCommand(light)
        turnOffCommand = new SwitchOffCommand(light)
    }

    def "Should turn on and turn off the light"() {
        when:
        turnOnCommand.execute()
        turnOffCommand.execute()

        then:
        1 * light.turnOn()
        1 * light.turnOff()
    }
}