import java.util.List;
import java.util.LinkedList;


class Polygone4{

    private List<Point> points;
    private int taille;
    private int nbElement;
    
    
    public Polygone4()
    {
	try
	    {
		this.nbElement = 0;
		this.taille = 10;
		this.points = new LinkedList<Point>();
	    }
	catch(NullPointerException e)
	    {
		throw e;
	    }
    }

    public Polygone4(int inTaille)
    {
	try
	    {
		this.nbElement = 0;
		this.taille = inTaille;
		this.points = new LinkedList<Point>();
	    }
	catch(NegativeArraySizeException e)
	    {
		throw e;
	    }
	catch(NullPointerException e)
	    {
		throw e;
	    }
    }

    public List<Point> getPoints()
    {
	return this.points;
    }

    public int getTaille(){
	return this.taille;
    }

    public int getNbElement(){
	return this.nbElement;
    }
    
    public void ajouter(Point p)
    {
	try
	    {
		++nbElement;
		this.points.add(p);
	    }
	catch(ArrayIndexOutOfBoundsException e)
	    {
		throw e;
	    }
    }

    public void enlever(int indice)
    {
	try{
	    System.out.println(this.points.remove(indice).toString());
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Tous les points sont déjà enlevés!");
		throw e;
	}
	catch(IndexOutOfBoundsException e){
	    System.out.println("Tous les points sont déjà enlevés!");
	    throw e;
	}
    }
}
