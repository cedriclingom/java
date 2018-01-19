class Polygone
{
    private Point[] points;
    private int indice;


    public Polygone()
    {
	try
	    {
		this.points = new Point[10];
	    }
	catch(NullPointerException e)
	    {
		throw e;
	    }
    }

    public Polygone(int taille)
    {
	try
	    {
		this.points = new Point[taille];
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

    public Point[] getPoints()
    {
	return this.points;
    }

    public int getIndice()
    {
	return this.indice;
    }
    
    public void ajouter(Point p)
    {
	try
	    {
		this.points[this.indice] = p;
		++this.indice;
	    }
	catch(ArrayIndexOutOfBoundsException e)
	    {
		throw e;
	    }
    }

    public void enlever()
    {
	try{
		--this.indice;
		System.out.println(this.points[this.indice].toString());
	    }catch(ArrayIndexOutOfBoundsException e)
	    {
		System.out.println("Tous les points sont déjà enlevés!");
	    }
    }
}
