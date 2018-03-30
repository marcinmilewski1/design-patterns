import patterns.factory.abstr.CompleteGuiFactory
import patterns.factory.abstr.GuiFactory
import patterns.factory.abstr.MinimalGuiFactory
import spock.lang.Specification

class GuiFactorySpec extends Specification {
    def "Should create minimal gui"() {
        given:
        GuiFactory factory = new MinimalGuiFactory()

        when:
        def bar = factory.createBar()
        def window = factory.createWindow()

        then:
        bar == "Minimal Bar"
        window == "Minimal Window"

    }

    def "Should create complete gui"() {
        given:
        GuiFactory factory = new CompleteGuiFactory()

        when:
        def bar = factory.createBar()
        def window = factory.createWindow()

        then:
        bar == "Complete Bar"
        window == "Complete Window"
    }
}