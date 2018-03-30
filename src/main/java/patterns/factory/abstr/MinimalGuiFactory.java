package patterns.factory.abstr;

public class MinimalGuiFactory implements GuiFactory {
    public String createWindow() {
        return "Minimal Window";
    }

    public String createBar() {
        return "Minimal Bar";
    }
}
