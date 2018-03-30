package patterns.factory.method;

import patterns.factory.abstr.CompleteGuiFactory;
import patterns.factory.abstr.GuiFactory;
import patterns.factory.abstr.MinimalGuiFactory;
import patterns.factory.method.type.ComputationalPower;

public class GuiFactoryResolver {
    public static GuiFactory getAppropriateGuiCreator(ComputationalPower computationalPower) {
        if (ComputationalPower.HIGH.equals(computationalPower)) {
            return new CompleteGuiFactory();
        } else if (ComputationalPower.LOW.equals(computationalPower)) {
            return new MinimalGuiFactory();
        }
        else {
            throw new IllegalArgumentException("Illegal computational power type");
        }
    }
}
