package definitionRectangle;

public class Rectangle {
	//propriétés
	private int id;
	private double longueur;
	private double largeur;
	public static int count;
	
	//constructeur
	public Rectangle(){
		id = ++count;
		longueur = 00.00;
		largeur = 00.00;		
	}
	public Rectangle(double longueur, double largeur){
		this.id = ++count;
		this.longueur =longueur;
		this.largeur = largeur;
	}
	
	//assecceur et mutateur
	public int getId(){
		return id;
	}
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
	
	public void setId(){
		this.id = ++count;
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
	public String isCarre(){
		String carre;
		if(this.getLongeur() == this.getLargeur()){
			carre = "c'est un carré";
		}else{
			carre = "ce n'est pas un carré";
		}
		return carre;
	}
	
	public String toString(){
       return "-"+this.getId()+" Longueur : "+this.getLongeur()+" Largeur : "+this.getLargeur()+" Périmètre : "+this.perimetre()+" Aire : "+this.aire()+" et "+this.isCarre();
	}
	
}
