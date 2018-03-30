import patterns.template.ARMCompiler
import patterns.template.X86Compiler
import spock.lang.Specification

class TemplateMethodSpec extends Specification {

    ARMCompiler armCompiler
    X86Compiler x86Compiler

    def setup() {
        armCompiler = Spy()
        x86Compiler = Spy(constructorArgs: [true])
    }

    def "Compile process should differ"() {
        when:
        armCompiler.compile()
        x86Compiler.compile()

        then:
        1 * x86Compiler.IsAmd64CompatibilityEnabled()
    }

}