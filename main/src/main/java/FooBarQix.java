public class FooBarQix {
    public String compute(int i) {
        StringBuilder res= new StringBuilder(String.valueOf(i));
        if(res.toString().contains("3") || i%3==0){
            res = computeSpecial(i,3,"foo",'3');
        }
        if(i%5==0 || String.valueOf(i).contains("5")){
            res = computeSpecial(i, 5, "bar", '5');
        }
        if(res.toString().contains("7"))
            res = new StringBuilder("qix");
        return res.toString();
    }

    private StringBuilder computeSpecial(int i, int i2, String bar, char c2) {
        StringBuilder res;
        res = new StringBuilder();
        if (i % i2 == 0)
            res.append(bar);
        char[] intArray = String.valueOf(i).toCharArray();
        for (char c : intArray)
            if (c == c2)
                res.append(bar);
        return res;
    }
}
