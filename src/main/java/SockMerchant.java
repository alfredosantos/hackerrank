import java.util.Arrays;

public class SockMerchant {

  // Complete the sockMerchant function below.
  static int sockMerchant(int n, int[] ar) {
    int count = 0;
    int[] sortInts = ar;
    Arrays.sort(sortInts);

    for (int i = 0; i < n; i++) {
      if (i + 1 < n && sortInts[i] == sortInts[i + 1]) {
        count++;
        i++;
      }
    }
    return count;
  }
}