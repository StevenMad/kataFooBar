

public class FooBarQix {

    public void displayNumbersAndFooBarQix(){
        for(int i=1;i<=100;i++){
            System.out.println(compute(i));
        }
    }

    public String compute(int i) {
        //StringBuilder res= new StringBuilder(String.valueOf(i));
        StringBuilder res=new StringBuilder();
        if(i%3==0 || i%5==0){
            computeDivisbleBy("foo", res, i, 3);
            computeDivisbleBy("bar", res, i, 5);
        }
        if(String.valueOf(i).contains("3") || String.valueOf(i).contains("5") || String.valueOf(i).contains("7")){
            res.append(computeIteration(i));
        }
        if(res.toString().isEmpty())
            return res.append(i).toString();
        return res.toString();
    }

    private StringBuilder computeIteration(int i) {
        StringBuilder res=new StringBuilder();
        String s=String.valueOf(i);
        for(int k=0;k<s.length();k++){
            int c=Integer.parseInt(s.substring(k,k+1));
            if(c==3)
                res.append("foo");
            if(c==5)
                res.append("bar");
            if(c==7)
                res.append("qix");
        }
        return res;
    }

    private void computeDivisbleBy(String bar, StringBuilder res, int i3, int i4) {
        if (i3%i4==0)
            res.append(bar);
    }
}
