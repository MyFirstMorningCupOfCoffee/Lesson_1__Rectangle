import java.util.Scanner;
import java.util.Locale;

class Rectangle3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Greetings! This program can help you to calculate");
		System.out.println("square and perimeter attributes for a rectangle with given sides lengths");
		System.out.println();
		System.out.print("Please, input side 1 length: ");
		String sideA_String = sc.nextLine();
		System.out.print("Please, input side 2 length: ");
		String sideB_String = sc.nextLine();
		
		Float sideA = readFloat(sideA_String);
		Float sideB = readFloat(sideB_String);
		
		// checking parameters "quality"
		if( (sideA == null || sideB == null) || (sideA <= 0 || sideB <= 0) )
		{
			System.out.println("Wrong parameters were given");
			System.out.println("Program will be terminated");
			return;
		}
		
		System.out.println();
		System.out.println("*** Given parameters ***");
		System.out.println("   Side A = " + sideA);
		System.out.println("   Side B = " + sideB);
		System.out.println();
		System.out.println("*** Calculated parameters ***");
		System.out.println("   Square = " + sideA * sideB); 
		System.out.println("Perimeter = " + (sideA + sideB) * 2 ); 
	}
	
	
	// bypass delimeter locales problems
	private static Float readFloat(String src)
	{
		try
		{
			src = src.replaceFirst(",", ".");
			Scanner sc = new Scanner(src);
			sc.useLocale(Locale.UK);
			return sc.nextFloat();
		}
		catch(Exception ex)
		{
			return null;
		}
	}
	
	
	
	
}