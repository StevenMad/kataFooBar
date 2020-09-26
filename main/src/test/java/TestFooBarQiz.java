import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestFooBarQiz {

    FooBarQiz fooBarQiz = new FooBarQiz();

    @Test
    public void compute_withOne_returnsOneAsString(){
        assertThat(fooBarQiz.compute(1),is("1"));
    }
}
