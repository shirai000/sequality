package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumA(int x, int y) {
    int sum = 0;
    for (int i = 0; i < y - x + 1; i++) {
      sum = sum + (x + i);
    }
    return sum;
  }

  public int sumO()
}
