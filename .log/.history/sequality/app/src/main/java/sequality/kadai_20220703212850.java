package sequality;

public class kadai {
  public String getGreeting() {
    return "Hello World!";
  }

  public string sum(int x, int y) {
    return x + y;
    string s = "Sum of" + x + "and" + y + "is" + (x+y)+". Average is" + (x+y)/2
  }

  public int sumA(int x, int y) {
    int sum = 0;
    for (int i = 0; i < y - x + 1; i++) {
      sum = sum + (x + i);
    }
    return sum;
  }

  public int sumO(int x, int y) {
    int sum = 0;
    for (int i = 0; i < y - x + 1; i++) {
      if ((x + i) % 2 != 0) {
        sum = sum + (x + i);
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
