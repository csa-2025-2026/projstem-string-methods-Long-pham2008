public class Main 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

  System.out.print("Enter first string for lastFirstN: ");
  String s1 = scanner.nextLine();
  System.out.print("Enter second string for lastFirstN: ");
  String s2 = scanner.nextLine();
  System.out.print("enter n: ");
  int n = scanner.nextInt();
  scanner.nextLine();
  lastFirstN(s1, s2, n);

  System.out.print("Enter first string for strinManip:");
  s1 = scanner.nextInt();
  System.out.print("Enter second string for strinManip:");
  s2 = scanner.nextInt();
  stringManip(s1, s2);

  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1,length(), s2.length())
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String lastN = s1.substring(s1.length() - n);
    String firstN = s2.substring(0, n);
    String output - lastN + firstN;

    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
   */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
