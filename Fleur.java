package tp5;

public class Fleur extends Plante {
	private String couleur;
	private int moisf;
	

	public Fleur(String nom, float hauteur, int age, float prix,String couleur, int moisf) {
		super(nom,hauteur,age, prix);
		this.couleur = couleur;
		this.moisf = moisf;
	}
	public String toString() {
		return super.toString()+"Fleur [couelur=" + couleur + ", moisf=" + moisf + "]";
	}
	public void description() {
		System.out.println(toString());
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getMoisf() {
		return moisf;
	}
	public void setMoisf(int moisf) {
		this.moisf = moisf;
	}
	public void fleurir() {
		if(moisf==4 || moisf==5 || moisf==6) {
			System.out.println("la fleur est en fleurs");
		}
		else
			System.out.println("la fleur n'est pas en fleurs");
		
	}
	
	

}
