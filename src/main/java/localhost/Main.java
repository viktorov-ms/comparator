package localhost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> animals = new ArrayList<>();
    animals.add("cat");
    animals.add("dog");
    animals.add("elephant");
    animals.add("bird");
    animals.add("giraffe");
    animals.add("frog");
    Collections.sort(animals, new StringLengthComparator());
//    [cat, dog, bird, frog, giraffe, elephant]
    System.out.println(animals);
  }
}

class StringLengthComparator implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    if (o1.length() > o2.length()) {
      return 1;
    }
    if (o1.length() < o2.length()) {
      return -1;
    }
    return 0;
  }
}
