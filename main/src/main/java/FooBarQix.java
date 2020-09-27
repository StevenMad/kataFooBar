public class FooBarQix {
    public String compute(int i) {
        String res=String.valueOf(i);
        if(i%3==0){
            res="foo";
        }
        if(i%5==0){
            res="bar";
        }
        if(res.contains("7"))
            res="qix";
        return res;
    }
}
