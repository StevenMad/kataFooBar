import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestFooBarQiz {

    FooBarQiz fooBarQiz = new FooBarQiz();

    @Test
    public void compute_withOneNumber_returnsNumberAsString(){
        assertThat(fooBarQiz.compute(8),is("8"));
    }

    @Test
    public void compute_withOne_returnsOneAsString(){
        assertThat(fooBarQiz.compute(1),is("1"));
    }

    @Test
    public void compute_withTwo_returnsTwoAsString(){
        assertThat(fooBarQiz.compute(2),is("2"));
    }

    @Test
    public void compute_withThree_returnsThreeAsString(){
        assertThat(fooBarQiz.compute(3),is("3"));
    }
}
