
public class Camion extends Vehicules{
    private float capacite;
    
   


    public Camion(String inImmat, int inCapacite){
	super(inImmat);
	this.capacite = inPlaces;
    }

    public final float getCapacite(){
	return this.capacite;
    }   

   
    public final void setCapacite(float inCapacite){
	this.capacite = inCapacite;
    }
    
    
    public void afficher(){
	StringBuffer sb = new StringBuffer();
	sb.append("immat: ").append(getImmat()).append("\n")
	    .append("capacite :").append(getCapacite()).append("\n");
	System.out.println(sb.toString());
    }
    public void avancer(){
	System.out.println("Je suis un camion  d'immat " + getImmat() + "et j'avance.");
    }
}
