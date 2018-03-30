package factory.method

import patterns.factory.abstr.CompleteGuiFactory
import patterns.factory.abstr.MinimalGuiFactory
import patterns.factory.method.GuiFactoryResolver
import patterns.factory.method.type.ComputationalPower
import spock.lang.Specification

class GuiFactoryResolverSpec extends Specification {
    def "Should create appropriate gui"() {
        expect:
        GuiFactoryResolver.getAppropriateGuiCreator(ComputationalPower.LOW) instanceof MinimalGuiFactory
        GuiFactoryResolver.getAppropriateGuiCreator(ComputationalPower.HIGH) instanceof CompleteGuiFactory


    }
}