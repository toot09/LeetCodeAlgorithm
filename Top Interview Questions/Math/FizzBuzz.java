import java.util.*;
class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>();
        for(int i=1 ; i<=n ; i++) {
            if(i%3==0 || i%5==0) {
                StringBuilder sb = new StringBuilder();
                if(i%3==0) sb.append("Fizz");
                if(i%5==0) sb.append("Buzz");
                ret.add(sb.toString());
            } else {
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
}