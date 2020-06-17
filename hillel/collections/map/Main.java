package hillel.collections.map;

import java.util.*;

public class Main {

  public static void main(String[] args) {

    Map<String, Student> myMap = new HashMap<>();

    myMap.put("OP654838", new Student("Artur Piliuk", 22));
    myMap.put("IK648393", new Student("Artur Fait", 22));

    System.out.println(myMap);


    Map<String, String> configuration = new HashMap<>();
    configuration.put("screenSize", "1024x768");
    configuration.put("screenSize", "1024x777");
    configuration.put("fontSize", "11");
    configuration.put("color", "red");
    configuration.put("browserName", "Chrome");

    System.out.println("Screen resolution: " + configuration.get("screenSize"));
    System.out.println("Font size: " + configuration.get("fontSize"));
    System.out.println(configuration);
    System.out.println();



    // Более длинный способ распечатать коллекцию Map
    Set<Map.Entry<String, String>> entries = configuration.entrySet();

    for (Map.Entry<String, String> me : entries) {
      System.out.print(me.getKey() + ":");
      System.out.println(me.getValue());
    }

  }
}
