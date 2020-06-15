package hillel.collections;

import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here

    List listOfNumbers = new LinkedList();

//    long startTime = System.currentTimeMillis() * 1000 / 60;
//    System.out.println("Start time..." + startTime);

    for (int i = 0; i < 40000000; i++) {
      listOfNumbers.add(i);
    }

//    long endTime = System.currentTimeMillis() * 1000 / 60;
//    System.out.println("End time..." + endTime);
//    System.out.println("Took time - " + (endTime - startTime));


//    listOfNumbers.get(6);

    // ......

    // for-each
//    for (Object item : listOfNumbers) {
//      System.out.println(item);
//    }

  }
}
