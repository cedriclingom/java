package cas2;


import java.util.List;
import java.util.ArrayList;

import camion.Camion;
import voiture.Voiture;


public class Garage{


    private List<Voiture> listVoiture;
    private List<Camion> listCamion;





    public final List<Voiture> getListVoiture(){
	return this.listVoiture;
    }
    public final List<Camion> getListCamion(){
	return this.listCamion;
    }


    public void afficher()
    {
	for(Voiture v: this.listVoiture){
	    v.afficher();
	}

	for(Camion c: this.listCamion){
	    c.afficher();
	}
    }

    public void avancer(){
	for(Voiture v: this.listVoiture){
	    v.avancer();
	}

	for(Camion c: this.listCamion){
	    c.avancer();
	}
    }


     public static void main(String[] argv){
	
	Garage g = new Garage();
	g.listVoiture = new ArrayList<Voiture>();
	g.listCamion = new ArrayList<Camion>();
	
	Voiture v= new Voiture();
	v.setImmat("BMW-ZZ2");
	v.setCouleur(125);
	v.setPlaces(5);
	g.getListVoiture().add(v);
	
	Camion c = new Camion();
	c.setImmat("SUBARU-321");
	c.setCapacite(32);
	g.listCamion.add(c);

	g.afficher();
	g.avancer();
	
    }
}
