package testNG;

import org.testng.annotations.Test;

public class TestNGGrouping2 {
  @Test(groups= {"B"})
  public void m1() {
  }
  @Test(groups= {"D"})
  public void m2() {
  }
  @Test(groups= {"D"})
  public void m3() {
  }
  @Test(groups= {"D"})
  public void m4() {
  }
}
