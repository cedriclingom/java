
public class Voiture extends Vehicule{
    private int couleur;
    private int places;
    


    public Voiiture(String inImmat, int inCouleur, int inPlaces){
	super(inImmat);
	this.couleur = inCouleur;
	this.places = inPlaces;
    }
   
    public final int getCouleur(){
	return this.couleur;
    }
    public final int getPlaces(){
	return this.places;
    }

    public final void setCouleur(int inCouleur){
	this.couleur = inCouleur;
    }
    public final void setPlaces(int inPlaces){
	this.places = inPlaces;
    }
    
    public void afficher(){
	StringBuffer sb = new StringBuffer();
	sb.append("immat: ").append(getImmat()).append("\n")
	    .append("couleur :").append(getCouleur()).append("\n")
	    .append("Places :").append(getPlaces()).append("\n");
	System.out.println(sb.toString());
    }
    public void avancer(){
	System.out.println("Je suis une voiture d'immat " + getImmat() + " et j'avance.");
    }
}
