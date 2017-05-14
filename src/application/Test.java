package application;

import definitionRectangle.Rectangle;


public class Test {

	public static void main(String[] args) {
	Rectangle[] rectangles = new Rectangle[3];
	rectangles[0] = new Rectangle(12.6, 5.3);
	rectangles[1] = new Rectangle(3.0, 3.0);
	rectangles[2] = new Rectangle(10.5, 5.0);
	
	for(Rectangle resultat : rectangles){
	System.out.println(resultat);
	}
	}
}
