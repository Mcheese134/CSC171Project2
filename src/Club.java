import java.util.Random;

public class Club {
	private int mean;
	private int stddev;
	private Random rand = new Random();
	
	public Club(int mean, int stddev) {
		this.mean = mean;
		this.stddev = stddev;
	}
	
	public double shot(int p) {
		
		//limit power between 1 and 10
		
		double g = rand.nextGaussian()*stddev + mean;
		double mult = ((double) p)/(10.0);
		return g*mult;
	}
}
