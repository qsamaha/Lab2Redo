import java.util.Scanner;

public class RoomAreaPerimeter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the room: ");
		double length = scan.nextDouble();
		System.out.println("Enter the width of the room: ");
		double width = scan.nextDouble();
		
		System.out.println("Area: " + (length * width));
		System.out.println("Perimeter: " + 2*(length + width));
		
		scan.close();
	}

}
