public class CountingValleys {

  // Complete the countingValleys function below.
  static int countingValleys(int n, String s) {
    int contValley = 0;
    int count = 0;

    char[] strArray = s.toCharArray();
    for (int i = 0; i < n; i++) {
      if (strArray[i] == 'U') {
        if (++count == 0) {
          contValley++;
        }
      } else {
        if (strArray[i] == 'D') {
          count--;
        }
      }
    }
    return contValley;
  }
}