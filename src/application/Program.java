package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a largura e altura do retângulo:");
		double width = sc.nextDouble(); 
		double heigth = sc.nextDouble();
		
		Rectangle rectangle = new Rectangle(width, heigth);
		
		System.out.printf("AREA = %.2f %n", rectangle.area());
		System.out.printf("PERIMETRO = %.2f %n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f %n", rectangle.diagonal());
		
		

		sc.close();
	}

}
