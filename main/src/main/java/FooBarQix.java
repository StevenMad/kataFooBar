public class FooBarQix {
    public String compute(int i) {
        //StringBuilder res= new StringBuilder(String.valueOf(i));
        StringBuilder res=new StringBuilder();
        if(String.valueOf(i).contains("3") || i%3==0){
            res.append(computeSpecial(i,3,"foo",'3'));
        }
        if(i%5==0 || String.valueOf(i).contains("5")){
            res.append(computeSpecial(i, 5, "bar", '5'));
        }
        if(String.valueOf(i).contains("7")){
            appendValueForEachIteration(i, "qix", '7', res);
        }
        if(res.toString().isEmpty())
            return res.append(i).toString();
        return res.toString();
    }

    private StringBuilder computeSpecial(int i, int i2, String bar, char c2) {
        StringBuilder res;
        res = new StringBuilder();
        if (i % i2 == 0)
            res.append(bar);
        appendValueForEachIteration(i, bar, c2, res);
        return res;
    }

    private void appendValueForEachIteration(int i, String bar, char c2, StringBuilder res) {
        char[] intArray = String.valueOf(i).toCharArray();
        for (char c : intArray)
            if (c == c2)
                res.append(bar);
    }
}
