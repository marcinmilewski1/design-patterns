package patterns.template;

public abstract class Compiler {

    public final void compile() {
        collectSource();
        compileToTarget();
    }

    // template methods
    protected abstract void collectSource();
    protected abstract void compileToTarget();

}
