import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive int: ");
    int num = sc.nextInt();
    System.out.println(isPrime(num));
  }

  public static boolean isPrime(int n)
  {
    if (n == 1){
      return false;
    }
    for (int i = 2; i < n; i++){ //i cant be 1 bc that always divides for ints
      if (n % i == 0){ //checks if n is divisible by i (numbers from 2 up to n)
        return false; 
      }
    }
    return true;
  }
}
