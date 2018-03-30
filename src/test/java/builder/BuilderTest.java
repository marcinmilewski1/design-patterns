package builder;

import org.junit.Assert;
import org.junit.Test;
import patterns.builder.BuildingObject;

public class BuilderTest {

    @Test
    public void shouldBuildObject() {
        BuildingObject obj = new BuildingObject.Builder().setValue1(1).setValue2(2).setValue3("3").build();
        Assert.assertTrue(obj.getValue1().equals(1));
        Assert.assertTrue(obj.getValue2().equals(2));
        Assert.assertTrue(obj.getValue3().equals("3"));
    }
}
