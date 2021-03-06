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
    public void compute_with1_returnsOneAsString(){
        assertThat(fooBarQiz.compute(1),is("1"));
    }

    @Test
    public void compute_with2_returnsTwoAsString(){
        assertThat(fooBarQiz.compute(2),is("2"));
    }

    @Test
    public void compute_with3_returnsFooFoo(){
        assertThat(fooBarQiz.compute(3),is("foofoo"));
    }

    @Test
    public void compute_with6_returnsFoo(){
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

    @Test
    public void compute_with5_returnsBarBar(){
        assertThat(fooBarQiz.compute(5),is("barbar"));
    }

    @Test
    public void compute_with10_returnsBar(){
        assertThat(fooBarQiz.compute(10),is("bar"));
    }

    @Test
    public void compute_with7_returnsQix(){
        assertThat(fooBarQiz.compute(7),is("qix"));
    }

    @Test
    public void compute_with17_returnsQix(){
        assertThat(fooBarQiz.compute(17),is("qix"));
    }

    @Test
    public void compute_with33_returnsFooFooFoo(){
        assertThat(fooBarQiz.compute(33),is("foofoofoo"));
    }

    @Test
    public void compute_withANumbercontaining3_returnsAsManyFooAs3IsPresent(){
        assertThat(fooBarQiz.compute(13),is("foo"));
    }

    @Test
    public void compute_with55_returnsBarBarBar(){
        assertThat(fooBarQiz.compute(55),is("barbarbar"));
    }

    @Test
    public void compute_with15_returnsFooBarBar(){
        assertThat(fooBarQiz.compute(15),is("foobarbar"));
    }

    @Test
    public void compute_with77_returnsQixQix(){
        assertThat(fooBarQiz.compute(77),is("qixqix"));
    }

    @Test
    public void compute_with27_returnsFooQix(){
        assertThat(fooBarQiz.compute(27),is("fooqix"));
    }

    @Test
    public void compute_with53_returnsBarFoo(){
        assertThat(fooBarQiz.compute(53),is("barfoo"));
    }

    @Test
    public void compute_with73_returnsQixFoo(){
        assertThat(fooBarQiz.compute(73),is("qixfoo"));
    }

}
