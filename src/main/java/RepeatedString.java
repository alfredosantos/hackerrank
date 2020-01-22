import java.util.Collections;
import java.util.List;

public class RepeatedString {

  // Complete the repeatedString function below.
  static long repeatedString(String s, long n) {
    long count = 0;
    char[] arrayN = s.toCharArray();
    int arrayNlen = arrayN.length;
    List arrayS = Collections.singletonList(n);
    for (int i = 0; i < n; i++) {
      if (arrayN[i] == arrayN[0]) {
        count++;
        System.out.println(arrayN[i]);
      } else {
        System.out.println(arrayN[i]);
        continue;
      }
    }
    return count;
  }
}