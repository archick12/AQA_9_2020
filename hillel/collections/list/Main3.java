package hillel.collections.list;

import java.util.HashSet;
import java.util.Set;

public class Main3 {

  public static void main(String[] args) {

    // Set

    Set<Integer> setCollection = new HashSet<>(); // Хранит только уникальные значения
    setCollection.add(1);
    setCollection.add(2);
    setCollection.add(2);
    setCollection.add(3);

    for (Integer element : setCollection) { // Тип каждого элемента : Сама коллекция
      System.out.println(element);
    }
  }
}
