package voiture;

public class Voiture{
    private String immat;
    private int couleur;
    private int places;
    
   


    public final String getImmat(){
	return this.immat;
    }
    public final int getCouleur(){
	return this.couleur;
    }
    public final int getPlaces(){
	return this.places;
    }

    public final void setImmat(String inImmat){
	this.immat = inImmat;
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
