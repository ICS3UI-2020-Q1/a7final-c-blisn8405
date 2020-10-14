import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {
  // create a method that will calculate the sum of an integer parameter called number
  public static boolean checkCode(int number){
    // see if the sum of the numbers can be divisible by 7
    //method to get the first digit
    int sum = 0;
    int remainder = 0;
    boolean divisible = true || false; 
    while(number < 0 || number > 0){
      remainder = number %10;
      number = number / 10;
      sum = sum + remainder;
      if(sum %7 == 0){
        divisible = true;
        } else 
        if(sum %7 !=0)
        divisible = false;  
      }
    
    return divisible;
  }
  

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input a Scanner
    //using a method with the scanner
    Scanner input = new Scanner(System.in); 
    System.out.println("Please enter a integer");
    int number = input.nextInt(); 
    //calculate if the sum is divisible by 7
    boolean divisible = checkCode(number);
    System.out.println(divisible);
  }
}
