package interfaces;

public class Circle implements Draw, Calculate, Comparable<Circle>{
	private Integer x,y,rad;
	private Double areaCirc;
	
	public Circle(Integer x, Integer y, Integer rad) {
		this.rad = rad;
		this.x = x;
		this.y = y;
	}
	

	@Override
	public double calculateArea() {	
		this.areaCirc=Math.PI * Math.pow(this.rad, 2);
		return areaCirc;
	}

    @Override
    public void draw(int color) {
    
    }

    @Override
    public void fill(int color) {
    
    }

	@Override
	public int compareTo(Circle o) {
		int com = 0;
		if (this.areaCirc > o.areaCirc) {
			com = 1;
		}
		if (this.areaCirc<o.areaCirc) {
			com = -1;
		}	
		return com;
	}
	
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

}
