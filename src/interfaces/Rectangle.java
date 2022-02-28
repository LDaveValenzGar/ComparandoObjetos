package interfaces;

public class Rectangle implements Draw, Calculate, Comparable<Rectangle> {
	private int al1,al2,b1,b2;
	private double areaRec;
	
    public Rectangle(int al1, int al2, int b1, int b2) {
		this.al1 = al1;
		this.al2 = al2;
		this.b1 = b1;
		this.b2 = b2;
	}
    

	@Override
    public double calculateArea() {
		this.areaRec = this.al1*this.b1;		
        return areaRec;
    }

    @Override
    public void draw(int color) {

    }

    @Override
    public void fill(int color) {

    }

	@Override
	public int compareTo(Rectangle o) {
		int com=0;
		if(this.areaRec>o.areaRec) {
			com=1;
		}
		if(this.areaRec<o.areaRec) {
			com=-1;
		}
		return com;
	}

	public int getAl2() {
		return al2;
	}

	public void setAl2(int al2) {
		this.al2 = al2;
	}

	public int getB2() {
		return b2;
	}

	public void setB2(int b2) {
		this.b2 = b2;
	}

}
