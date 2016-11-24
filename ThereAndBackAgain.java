public class ThereAndBackAgain {
  public static void main(String[] args) {
    System.out.println("Here.");
    erebor();
    System.out.println("Back first time.");
    System.out.println("Back second time.");
  }

  public static void erebor() {
    System.out.println("There.");
  }
}

// attempting to call erebor without parens causes compilation error
