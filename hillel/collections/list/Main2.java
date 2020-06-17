package hillel.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

  public static void main(String[] args) {

    List<Human> listOfHumans = new ArrayList<>();

    for (int i = 1; i <= 1000; i++) {
      Student student = new Student("Student_" + i, 33);
      Teacher teacher = new Teacher("Teacher_" + i, 40);
      listOfHumans.add(student);
      listOfHumans.add(teacher);
    }

    for (Human human : listOfHumans) {
      System.out.println(human.toString());
    }
  }
}
