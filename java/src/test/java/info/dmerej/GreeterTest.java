package info.dmerej;

import org.junit.jupiter.api.Test;

class GreeterTest {

  class MockClock extends SystemClock {

    private int currentHour;

    public MockClock(int currentHour) {
      this.currentHour = currentHour;
    }

    @Override
    public int getCurrentHour() {
      return this.currentHour;
    }

    public void setCurrentHour( int currentHour){
      this.currentHour = currentHour;
    }
  }


  @Test
  void nightlyGreeting() {
    // Assert that greeter says "Good night" when current hour is 0 (midnight)

    //given
    Greeter greeter = new Greeter(new MockClock(0));

    //when
    String greeting = greeter.greet();

    //then
    assert greeting.equals("Good night");
  }

  @Test
  void neverAsserts() {
    // Assert that the assertion in greet() is never thrown, by checking all hours from 0 to 23

    //given
    Greeter greeter;
    MockClock clock = new MockClock(0);

    //when
    for (int i = 0; i < 24; i++) {
      clock.setCurrentHour(i);
      greeter = new Greeter(clock);
      greeter.greet();
    }

    //then
    // If the assertion is thrown, the test will fail
    assert true;
  }
}
