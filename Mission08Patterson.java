import java.util.*;

public class Mission08Patterson
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      double weightInPounds = 0.00;
      double heightInInches = 0.00;
      double bmi = 0.00;
      boolean error = false;
      //System.out.println(bmi);
      
      System.out.print("Enter height in inches: ");
      do
      {
         error = false;
         // Try for invalid input
         try
         {
            heightInInches = in.nextDouble();
            // Check for positive number > 0
            while(heightInInches <= 0)
            {
               System.out.print("Invalid inches value.  Must be positive.\nRe-enter height in inches: ");
               heightInInches = in.nextDouble();
            }
         }
         catch (InputMismatchException e)
         {
            error = true;
            System.out.print("Invalid inches value.  Must be a decimal number.\nRe-enter height in inches: ");
            in.nextLine();
         }
      } while(error); // End Do While for height
      
      System.out.print("Enter weight in pounds: ");
      do
      {
         // Reset error flag
         error = false;
         // Try for invalid input
         try
         {
            weightInPounds = in.nextDouble();
            while(weightInPounds <= 0)
            {
               System.out.print("Invalid pounds value.  Must be positive.\nRe-enter weight in inches: ");
               heightInInches = in.nextDouble();
            }// End while
         } // End try
         catch (InputMismatchException e)
         {
            error = true;
            System.out.print("Invalid pounds value.  Must be a decimal number\nRe-enter weight in pounds: ");
            in.nextLine();
         } // end catch
      } while(error); // end do while for weight
      
      bmi = (704*weightInPounds)/(Math.pow(heightInInches,2));
      
      System.out.println("\nHeight = " + heightInInches + "\"");
      System.out.println("Weight = " + weightInPounds + " pounds");
      System.out.println(String.format("Body mass index = %.1f", bmi));
      
      //System.out.println(String.format("BMI is: %.1f", bmi));
      //DecimalFormat df = new DecimalFormat("#.##");
      //System.out.println(df.format(bmi));
   }
}