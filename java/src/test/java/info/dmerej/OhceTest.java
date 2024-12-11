package info.dmerej;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OhceTest {
  @Test
  void testMainLoop() {
    ArrayList<String> inputs = new ArrayList<>();
    inputs.add("hello");
    inputs.add("oto");
    inputs.add("quit");

    MockConsoleInteractor mockInteractor = new MockConsoleInteractor(inputs);
    Ohce ohce = new Ohce(mockInteractor);
    ohce.mainLoop();

    List<String> output = mockInteractor.getOutput();
    assert output.size() == 3;
    assert output.get(0).equals("olleh");
    assert output.get(1).equals("oto");
    assert output.get(2).equals("That was a palindrome!");
  }
}
