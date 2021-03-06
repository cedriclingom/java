import java.util.Vector;

    
class Polygone2
{
    private Vector<Point> points;
    private int taille;
    private int nbElement;


    public Polygone2()
    {
	try
	    {
		this.nbElement = 0;
		this.taille = 10;
		this.points = new Vector<Point>(10);
	    }
	catch(NullPointerException e)
	    {
		throw e;
	    }
    }

    public Polygone2(int inTaille)
    {
	try
	    {
		this.nbElement = 0;
		this.taille = inTaille;
		this.points = new Vector<Point>(inTaille);
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

    public Vector<Point> getPoints()
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
		this.points.addElement(p);
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
