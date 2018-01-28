public class Main
{
     public static void main(String[] args)
    {
	boolean continuer = true;
	try
	    {
		Polygone4 poly = new Polygone4();
		for(int i=0; continuer && (poly.getNbElement() < poly.getTaille()); ++i)
		    {
			try
			    {
				poly.ajouter(new Point(i,0));
			    }
			catch(ArrayIndexOutOfBoundsException e)
			    {
				System.out.println("Out of index >!");
				continuer = false;
			    }
		    }
		continuer = true;
		for(int i=poly.getPoints().size() - 1; continuer; --i)
		    {
			try
			    {
				poly.enlever(i);
			    }
			catch(ArrayIndexOutOfBoundsException e)
			    {
				System.out.println("Out of index <!");
				continuer = false;
			    }
			catch(IndexOutOfBoundsException e){
			    System.out.println("Out of index <!");
			    continuer = false;
			}
		    }
	    }
	catch(NegativeArraySizeException e)
	    {
		System.out.println("Negative size of Array given!");
	    }
	catch(NullPointerException e)
	    {
		System.out.println("Allocation of the table was impossible!");
	    }
    }
}
