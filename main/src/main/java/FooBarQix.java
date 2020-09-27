public class FooBarQix {
    public String compute(int i) {
        if(i%3==0){
            return "foo";
        }
        if(i%5==0){
            return "bar";
        }
        return String.valueOf(i);
    }
}
