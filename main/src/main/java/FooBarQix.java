public class FooBarQix {
    public String compute(int i) {
        StringBuilder res= new StringBuilder(String.valueOf(i));
        if(res.toString().contains("3") || i%3==0){
            res = new StringBuilder();
            char[] intArray=String.valueOf(i).toCharArray();
            for (char c : intArray) {
                if (c == '3')
                    res.append("foo");
            }
            if(i%3==0)
                res.append("foo");
        }
        if(i%5==0){
            res = new StringBuilder("bar");
        }
        if(res.toString().contains("7"))
            res = new StringBuilder("qix");
        return res.toString();
    }
}
