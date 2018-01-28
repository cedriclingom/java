import java.util.List;
import java.util.ArrayList;


class Polygone3{

    private List<Point> points;
    private int taille;
    private int nbElement;
    
    
    public Polygone3()
    {
	try
	    {
		this.nbElement = 0;
		this.taille = 10;
		this.points = new ArrayList<Point>(10);
	    }
	catch(NullPointerException e)
	    {
		throw e;
	    }
    }

    public Polygone3(int inTaille)
    {
	try
	    {
		this.nbElement = 0;
		this.taille = inTaille;
		this.points = new ArrayList<Point>(inTaille);
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
	}catch(ArrayIndexOutOfBoundsException e)
	    {
		System.out.println("Tous les points sont déjà enlevés!");
		throw e;
	    }
    }
}
