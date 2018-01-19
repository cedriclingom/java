package tp1;


import java.util.Vector;

    
class Polygone2
{
    private Vector<Point> points;


    public Polygone2()
    {
	try
	    {
		this.points = new Vector<Point>(10);
	    }
	catch(NullPointerException e)
	    {
		throw e;
	    }
    }

    public Polygone2(int taille)
    {
	try
	    {
		this.points = new Vector<Point>(taille);
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
    
    public void ajouter(Point p)
    {
	try
	    {
		this.points.addElement(p);
		//++this.indice;
	    }
	catch(ArrayIndexOutOfBoundsException e)
	    {
		throw e;
	    }
    }

    public void enlever(int indice)
    {
	try{
	    //--this.indice;
	    System.out.println(this.points.remove(indice).toString());
	    }catch(ArrayIndexOutOfBoundsException e)
	    {
		System.out.println("Tous les points sont déjà enlevés!");
		throw e;
	    }
    }
}
