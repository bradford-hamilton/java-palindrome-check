public class PalindromeTester {

  public boolean isPalindrome(String input) {
    String sanitize = input.replaceAll(" ", "");
    int len = sanitize.length();
    for ( int i = 0; i < (len / 2); i++ ) {
      if ( sanitize.charAt(i) != sanitize.charAt(len - i - 1) ) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    printTestPalindrome("race car"); //true
    printTestPalindrome("wat"); //false
    printTestPalindrome("stack cats"); //true
    printTestPalindrome("who"); //false
    printTestPalindrome("step on no pets"); //true
    printTestPalindrome("when"); //false
    printTestPalindrome("taco cat"); //true
  }

  public static void printTestPalindrome(String input) {
    PalindromeTester tester = new PalindromeTester();
    System.out.println(input + ": " + tester.isPalindrome(input)); //true
  }

}
