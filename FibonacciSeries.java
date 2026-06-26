public class FibonacciSeries {
  public static void main(String[] args) {
    int n = 10; // number of Fibonacci numbers to print
    if (args.length > 0) {
      try {
        n = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Using default n = 10.");
      }
    }

    System.out.println("Fibonacci series up to " + n + " terms:");
    printFibonacciSeries(n);
  }

  private static void printFibonacciSeries(int n) {
    if (n <= 0) {
      System.out.println("Please enter a positive number.");
      return;
    }

    long a = 0;
    long b = 1;
    for (int i = 1; i <= n; i++) {
      System.out.print(a);
      if (i < n) {
        System.out.print(", ");
      }
      long next = a + b;
      a = b;
      b = next;
    }
    System.out.println();
  }
}
