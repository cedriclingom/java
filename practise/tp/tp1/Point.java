public class Point
{

    private double x;
    private double y;
    private static int cpt = 0;

    



    public Point()
    {
	this.x=0;
	this.y=0;
	++Point.cpt;
    }
    public Point(double px, double py)
    {
	this.x=px;
	this.y=py;
	++Point.cpt;
    }
    public double getX()
    {
	return this.x;
    }

    public void setX(double px)
    {
	this.x = px;
    }

    public double getY()
    {
	return this.y;
    }

    public static int getCpt()
    {
	return Point.cpt;
    }

    public void setY(double py)
    {
	this.y = py;
    }
    
    public String toString()
    {
	return "Point: " + "(" + this.x  + ", " + this.y + ")";
    }   
    
}


