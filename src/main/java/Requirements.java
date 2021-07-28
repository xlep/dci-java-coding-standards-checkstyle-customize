// this class does not have a valid Javadoc comment, even though it is private
public class Requirements {

  // the following line is too long for the default line length of 100 characters
  private final String helloWorld = "Hello World! This string is way too long and will break the default line limit by a few characters.";

  public boolean printStuff(String input) {
    // this reference should require a "this"
    return internalMethod(input);
  }

  // this method is too long
  private boolean internalMethod(String input) {
    System.out.println("printing input:");
    System.out.println(input);

    for (int i = 0; i < 5; i++) {
      for (int k = 0; k <= i; k++) {
        System.out.print('*');
      }
      System.out.println("");
    }

    int number1 = 1;
    int number2 = 2;
    System.out.print(number1 + " + " + number2 + " is ");
    System.out.println(number1 + number2);

    System.out.println("========================");
    System.out.println(helloWorld);
    System.out.println("========================");

    return true;
  }

}
