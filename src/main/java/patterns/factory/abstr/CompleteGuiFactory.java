package patterns.factory.abstr;

public class CompleteGuiFactory implements GuiFactory{

    public String createWindow() {
        return "Complete Window";
    }

    public String createBar() {
        return "Complete Bar";
    }
}
