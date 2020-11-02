import java.util.Scanner;
public class Exercise2 {

	private static Scanner in;
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	printExercise1();
	printExercise2();
	printExercise3();
	printExercise4();
	printExercise5();
	printExercise6();
	printExercise7();
	printExercise8();
	printExercise9();
	printExercise10();
	}
	
	public static void printExercise1() {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your first name: ");
	String firstname = input.next();
	System.out.print("Enter your middle name: ");
	String middlename = input.next();
	System.out.print("Enter your last name: ");
	String lastname = input.next();
	System.out.println();
	System.out.println("Hello \n" + firstname + " " + middlename + " "  + lastname);	
	}
	
	public static void printExercise2() {
	Scanner input = new Scanner(System.in);
	System.out.print("Specified Expression is ");
	double formula = 4.0 * (1-(1.0/3) + (1.0/5) - (1.0/9) - (1.0/11));
	System.out.println("\n 4.0 * (1-(1.0/3) + (1.0/5) - (1.0/9) - (1.0/11))" + "\n = " + formula);

	}
	
	public static void printExercise3() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input the radius of the circle: ");
	double radius = input.nextDouble();
	double perimeter = (2 * radius * Math.PI);
	double area = (Math.PI * (radius * radius));
	System.out.println("Perimeter:\n" + perimeter + "\n" + "Area: \n" + area);
	
	}
	
	public static void printExercise4() {
	Scanner input = new Scanner(System.in);	
	System.out.print("Input width of the rectangle: ");
	double width = input.nextDouble();
	System.out.print("Input height of the rectangle: ");
	double height = input.nextDouble();
	double area = (width * height);
	double perimeter = ((2 * width) + (2 * height));
	System.out.println("Area:\t" + area + "\n" + "Perimeter:\t" + perimeter );
	
	}
	
	public static void printExercise5() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input integer a: ");
	int a = input.nextInt();
	System.out.print("Input integer b: ");
	int b = input.nextInt();
	System.out.println("Before swapping : a,b = "+a+", "+ + b);
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("After swapping : a,b = "+a+", "+ + b);
	
	}
	
	public static void printExercise6() {
	Scanner input = new Scanner(System.in);
	double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
	System.out.println(pi);
	}
	
	public static void printExercise7() {
	Scanner input = new Scanner(System.in);	
	final double width = 5.6;
	final double height = 8.5;
	
	double perimeter = 2*(height + width);
	double area = width * height;
	System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
	System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
	}
	
	public static void printExercise8() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input first number: ");
	int num1 = input.nextInt();
	
	System.out.print("Input second number: ");
	int num2 = input.nextInt();
	
	System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
	}
	
	public static void printExercise9() {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input first number: ");
	int num1 = input.nextInt();
	
	System.out.print("Input second number: ");
	int num2 = input.nextInt();
	
	System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	
	System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	
	System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
	
	System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	
	System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
	}
	
	public static void printExercise10() {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input first number: ");
	int num1 = input.nextInt();
	
	System.out.print("Input second number: ");
	int num2 = input.nextInt();
	
	System.out.print("Input third number: ");
	int num3 = input.nextInt();
	
	System.out.print("Input fourth number: ");
	int num4 = input.nextInt();
	
	System.out.print("Enter fifth number: ");
	int num5 = input.nextInt();
	
	System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
	
	}
}




