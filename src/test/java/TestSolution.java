import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

  @Test
  public void testGetFirstSmallestPositiveNumber() {
    int[] arrays = {10,20,20,10,10,30,50,10,20};
    Assert.assertEquals(3, SockMerchant.sockMerchant(9, arrays));
  }

  @Test
  public void testCountingValleys() {
    Assert.assertEquals(2, CountingValleys.countingValleys(16, "UDDDUDUUUDDDUDUU"));
  }

  @Test
  public void testJumpingOnClouds1() {
    int[] arrays = {0,0,1,0,0,1,0};
    Assert.assertEquals(4,JumpingOnClouds.jumpingOnClouds(arrays));
  }

  @Test
  public void testJumpingOnClouds2() {
    int[] arrays = {0,0,0,0,1,0};
    Assert.assertEquals(3,JumpingOnClouds.jumpingOnClouds(arrays));
  }

  @Test
  public void testRepeatedString() {
    Assert.assertEquals(4,RepeatedString.repeatedString("abcac", 10));
  }

  @Test
  public void testRepeatedStringA() {
    Assert.assertEquals(9,RepeatedString.repeatedString("a", 10));
  }

  @Test
  public void testRepeatedStringB() {
    Assert.assertEquals(1000000000000L,RepeatedString.repeatedString("a", 1000000000000L));
  }
}