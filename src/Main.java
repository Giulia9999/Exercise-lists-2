import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> divisorsOf52 = new ArrayList<>(Arrays.asList(1, 2, 4, 13, 26, 52));
        List<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1, 60, 13, 12));
        randomNumbers.addAll(divisorsOf52);
        System.out.println(randomNumbers + " - size: " + randomNumbers.size());
        Set<Integer> numberSet = new HashSet<>(randomNumbers);
    }
}
