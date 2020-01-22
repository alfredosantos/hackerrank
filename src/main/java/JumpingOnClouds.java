public class JumpingOnClouds {

  // Complete the jumpingOnClouds function below.
  static int jumpingOnClouds(int[] c) {
    int count = 0;
    int next = 0;
    for (int i = 0 ; i < c.length; i++) {
      next = i + 1;
      if (c[i] == 0 && (next < c.length && c[next] == 0)) {
        i = i + 1;
        count++;
      } else {
        if (c[i] == 1) {
          count++;
        }
      }
    }
    return count;
  }
}