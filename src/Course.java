
public class Course {
	private int[][] holedata = new int[18][2];
	private String name;
	
	public String getCourseName() {
		return name;
	}
	
	public int getCoursePar() {
		int par = 0;
		for(int i=0;i<18;i++) {
			par+=holedata[i][1];
		}
		return par;
	}
	
	public int getHoleYards(int h) {
		return holedata[h-1][0];
	}
	
	public int getHolePar(int h) {
		return holedata[h-1][1];
	}
	
	public Course(String name, int[][] holedata) {
		this.name=name;
		this.holedata=holedata;
	}

}
