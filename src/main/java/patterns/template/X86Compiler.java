package patterns.template;

public class X86Compiler extends Compiler {

    boolean amd64Compatibility;
    public X86Compiler(boolean amd64Compatibility) {
        this.amd64Compatibility = amd64Compatibility;
    }

    @Override
    protected void collectSource() {

    }

    @Override
    protected void compileToTarget() {
        if (IsAmd64CompatibilityEnabled()) {
            //...
        }
    }

    public boolean IsAmd64CompatibilityEnabled() {
        return this.amd64Compatibility;
    }
}
