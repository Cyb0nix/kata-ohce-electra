package info.dmerej;

public class Application {
  public static void main(String[] args) {
    var greeter = new Greeter(new SystemClock());
    String greetings = greeter.greet();
    System.out.println(greetings);

    var ohce = new Ohce();
    ohce.mainLoop();
  }
}
