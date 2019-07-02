package boxStack;

public class Box implements Comparable<Box>{
	private final int d1;
	private final int d2; 
	private final int d3; 
	private final int name;
	private int orientation;

	public Box(int d1, int d2, int d3, int o, int name){
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3; 
		this.name = name;
		orientation = o; 
	}
	public int[] getFace(){
		switch (orientation) {
		case 1:
			return new int[]{d2,d3};
		case 2:
			return new int[]{d3,d2};
		case 3:
			return new int[]{d3,d1};
		case 4:
			return new int[]{d1,d3};
		case 5:
			return new int[]{d2,d1};
		case 6:
			return new int[]{d1,d2};
		default:
			return null;
		}
	}
	public Box rotate(int orientation, int name){
		Box newBox = new Box(this.d1, this.d2, this.d3, orientation, name);
		return newBox;
	}
	public int getHeight(){
		switch (orientation) {
		case 1:
			return d1;
		case 2:
			return d1;
		case 3:
			return d2;
		case 4:
			return d2;
		case 5:
			return d3;
		case 6:
			return d3;
		default:
			return 0;
		}

	}

	public int getName(){
		return name;
	}
  //  public int getD1() {return d1;}
//	public int getD2() {return d2;}
//	public int getD3() {return d3;}
	public int compareTo(Box x) {
		return x.getFace()[0] - this.getFace()[0];
	}
}
