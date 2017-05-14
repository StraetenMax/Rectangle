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
	public double perimetre(double perimetre){
		perimetre = (this.getLongeur()+this.getLargeur())*2;
		return perimetre;			
	}
	public double aire(double aire){
		aire = this.getLongeur()*this.getLargeur();
		return aire;
	}
	public boolean isCarre(){
		boolean carre;
		if(this.getLongeur() == this.getLargeur()){
			carre = true;
		}else{
			carre = false;
		}
		return carre;
	}
	
	//public String toString(){
		
	//}
	
}
