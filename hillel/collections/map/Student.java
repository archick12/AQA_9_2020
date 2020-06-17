package hillel.collections.map;

public class Student extends Human {

  String name;
  int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student details. Name: " + name + " Age: " + age;
  }
}
