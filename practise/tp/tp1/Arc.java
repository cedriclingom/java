class Arc
{
    private Point origine;
    private Point destination;




    public Arc()
    {
	this.origine = new Point();
	this.destination = new Point();
    }

    public Arc(Point o, Point d)
    {
	this.origine = o;
	this.destination = d;
    }

    public Point getOrigine()
    {
	return this.origine;
    }

    public Point getDest()
    {
	return this.destination;
    }

    public void setOrigine(Point o)
    {
	if(this.origine == null)
	    {
		this.origine = o;
	    }
	else
	    {
		
		this.origine.setX(o.getX());
		this.origine.setY(o.getY());
	    }
    }

     public void setDest(Point d)
    {
	if(this.destination == null)
	    {
		this.destination = d;
	    }
	else
	    {
		
		this.destination.setX(d.getX());
		this.destination.setY(d.getY());
	    }
    }

    public String toString()
    {
	return "Arc:" + " Origine: " + origine.toString()+ "destination: " + destination.toString();
    }
}
