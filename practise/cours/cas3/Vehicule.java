import java.util.List;
import java.util.ArrayList;


import cas3.camion;
import cas3.voiture;




public class Vehicule{

    protected String immat;


    public Vehicule(){
	this("");
    }
    public Vehicule(String inImmat){
	this.immat = inImmat;
    }


     public final String getImmat(){
	return this.immat;
    }

     public final void setImmat(String inImmat){
	this.immat = inImmat;
    }


    public void afficher(){
	StringBuffer sb = new StringBuffer();
	sb.append("immat: ").append(getImmat());
	System.out.println(sb.toString());
    }



    public static void main(String[] args){

	ArrayList<Vehicule> listVehicule = ArrayList<Vehicule>();

	Voiture v= new Voiture("BMW-ZZ2", 125, 5);
	listeVehicule.add(v);
	
	Camion c = new Camion("SUBARU-321", 32);
	listeVehicule.add(c);
	for(Vehicule vi : listeVehicule){
	    vi.afficher();
	}
	
    }
}
