/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }

  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());
  }

  public void testsum() {
    App classUnderTest = new App();
    assertEquals(5, classUnderTest.sum(2, 3));
  }

  public void testsumA() {
    App classUnderTest = new App();
    assertEquals(55, classUnderTest.sum(1, 10));
  }

  public void testsumO() {
    App classUnderTest = new App();
    assertEquals(5, classUnderTest.sum(2, 3));
  }
}
