import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1{
   public static List<Integer> randomList(int min, int maxIncl, int count) {
    return new Random() 
        .ints(min, maxIncl + 1)
        .limit(count)  
        .boxed()        
        .collect(Collectors.toList()); 
}
public static List<Integer> evenNumbersRemover(List<Integer> listnumbers) {
    Iterator<Integer> itr = listnumbers.iterator();
    while (itr.hasNext())
    {
        int x = (Integer)itr.next();
        if (x % 2 == 0) {
            itr.remove();
        }
    } 
    return listnumbers;
}

public static int maxNumberfinder(List<Integer> listnumbers) {
    int maxNumber = listnumbers.get(0);
    for(int i = 0; i<listnumbers.size(); i++)
      if(maxNumber<listnumbers.get(i)) maxNumber = listnumbers.get(i);
    return maxNumber;
}
public static int minNumberfinder(List<Integer> listnumbers) {
    int minNumber = listnumbers.get(0);
    for(int i = 0; i<listnumbers.size(); i++)
      if(minNumber>listnumbers.get(i)) minNumber = listnumbers.get(i);
    return minNumber;
}
public static int avarageNumberfinder(List<Integer> listnumbers) {
    int averageNumber = 0;
    for(int i = 0; i<listnumbers.size(); i++)
      averageNumber += listnumbers.get(i);
    return averageNumber/listnumbers.size();
}    
public static void main(String[] args) {
      List<Integer> primeNumberList = randomList(-9, 234, 100);
      System.out.println("Array without even numbers: "+evenNumbersRemover(primeNumberList));
      System.out.println("min number: "+minNumberfinder(primeNumberList));
      System.out.println("max number: "+maxNumberfinder(primeNumberList));
      System.out.println("avarage number: "+avarageNumberfinder(primeNumberList));
   }
}