import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> divisorsOf52 = new ArrayList<>(Arrays.asList(1, 2, 4, 13, 26, 52));
        List<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1, 60, 13, 12));
        randomNumbers.addAll(divisorsOf52);
        System.out.println(randomNumbers);
    }
}
