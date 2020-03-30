import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingCollectors{
    
    public static void main(String[]args){
        
        List<String> x = Arrays.asList("1","2","2","3","4","5","6","7","8","9","10");
        
        System.out.println(x);

        List<Integer> evens = x.stream()
            .map(s -> Integer.valueOf(s))
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

        System.out.println(evens);

        int sumOfEvens = x.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(n -> n % 2 == 0)
            .sum();

        System.out.println(sumOfEvens);
    }
}
