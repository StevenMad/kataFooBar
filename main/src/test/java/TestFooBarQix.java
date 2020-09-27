import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestFooBarQix {

    FooBarQix fooBarQiz = new FooBarQix();

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
    public void compute_withThree_returnsFoo(){
        assertThat(fooBarQiz.compute(3),is("foo"));
    }

    @Test
    public void compute_withSix_returnsFoo(){
        assertThat(fooBarQiz.compute(6),is("foo"));
    }

    @Test
    public void compute_with9_returnsFoo(){
        assertThat(fooBarQiz.compute(9),is("foo"));
    }

    @Test
    public void compute_withANumberDivisibleBy3_ReturnsFoo(){
        assertThat(fooBarQiz.compute(12),is("foo"));
    }
}
