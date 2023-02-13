import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Integer> divisorsOf52 = new ArrayList<>(Arrays.asList(1, 2, 4, 13, 26, 52));
        List<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1, 60, 13, 12));
        randomNumbers.addAll(divisorsOf52);
        System.out.println(randomNumbers + " - size: " + randomNumbers.size());

       ListIterator<Integer> iterator = randomNumbers.listIterator();
       while(iterator.hasNext()){
           int index = iterator.nextIndex();
           int value = iterator.next();
           System.out.println(index + " - " + value);
           for(int i = 0; i< index; i++){
               if(value == randomNumbers.get(i)){
                   iterator.remove();
               }
           }
       }
        System.out.println(randomNumbers);

        System.out.println("----------------------------------------------------");
        Set<Integer> numberSet = new HashSet<>(randomNumbers);
        randomNumbers = new ArrayList<>(numberSet);
        System.out.println(randomNumbers + " - size: " + randomNumbers.size());

        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println(randomNumbers);
    }
}