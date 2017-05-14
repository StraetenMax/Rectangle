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
	public Rectangle(double longueur, double largeur){
		this.longueur =longueur;
		this.largeur = largeur;
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
	public double perimetre(){
		double perim = (this.getLongeur()+this.getLargeur())*2;
		return perim;			
	}
	public double aire(){
		double air = this.getLongeur()*this.getLargeur();
		return air;
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
	
	public String toString(){
       return "- Longueur : "+this.getLongeur()+" Largeur : "+this.getLargeur()+" Périmètre : "+this.perimetre()+" Aire : "+this.aire()+" c'est un carré "+this.isCarre();
	}
	
}
