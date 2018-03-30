package adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import patterns.adapter.Adaptee;
import patterns.adapter.Adapter;

@RunWith(MockitoJUnitRunner.class)
public class AdapterTest {

    @Test
    public void should_adapter_call_adaptee_interface() throws Exception {
        Adaptee adaptee= Mockito.mock(Adaptee.class);
        Adapter adapter = new Adapter(adaptee);
        Adapter spy = Mockito.spy(adapter);
        spy.operation();
        Mockito.verify(spy, Mockito.times(1)).operation();
        Mockito.verify(adaptee, Mockito.times(1)).specificAdapteeOperation();
    }
}
