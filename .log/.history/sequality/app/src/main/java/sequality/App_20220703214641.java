/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

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

  public int sumO(int x, int y) {
    int sum = 0;
    for (int i = 0; i < y - x + 1; i++) {
      if ((x + i) % 2 != 0) {
        sum = sum + (x + i);
      }
    }
    return sum;
  }

  public int sumE(int x, int y) {
    int sum = 0;
    for (int i = 0; i < y - x + 1; i++) {
      if ((x + i) % 2 == 0) {
        sum = sum + (x + i);
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out
        .println("Sum of 2 and 3 is " + new App().sum(2, 3) + " Average is " + (double) (new App().sum(2, 3)) / 2 + ".");
    System.out
        .println("Sum of 1 to 10 is " + new App().sumA(1, 10) + " Average is " + (double) (new App().sumA(1, 10)) / 10 + ".");
    System.out
        .println("Sum of odd of 1 to 10 is " + new App().sumO(1, 10) + " Sum of even is " + new App().sumE(1, 10) + ".");
  }
}
