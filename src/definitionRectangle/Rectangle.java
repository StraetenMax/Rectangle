package definitionRectangle;

public class Rectangle {
	//propriétés
	private double longueur;
	private double largeur;
	
	//constructeur
	public Rectangle(){
		longueur = 00.00;
		largeur = 00.00;		
	}
	public Rectangle(double longueur, double lageur){
		this.longueur =longueur;
		this.largeur =largeur;
	}
	
	//assecceur et mutateur
	public double getLongeur(){
		return longueur;
	}
	public double getLargeur(){
		return largeur;
	}
	public void setLongueur(double longueur){
		this.longueur= longueur;
	}
	public void setLargeur(double largeur){
		this.largeur= largeur;
	}
	
	//methodes
	
}
