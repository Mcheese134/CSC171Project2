
public class GameInit {
	
	private static int[][] c1array = new int[][] {
		{530,5},
		{305,4},
		{331,4},
		{201,3},
		{500,5},
		{226,3},
		{409,4},
		{410,4},
		{229,3},
		{433,4},
		{363,4},
		{174,3},
		{545,5},
		{419,4},
		{512,5},
		{410,4},
		{320,4},
		{170,3}
	};
		
	private static int[][] c2array = new int[][] {
		{376,4},
		{453,4},
		{397,4},
		{480,4},
		{568,5},
		{412,4},
		{371,4},
		{175,3},
		{352,4},
		{386,4},
		{174,3},
		{348,4},
		{465,4},
		{618,5},
		{455,4},
		{423,4},
		{495,4},
		{357,4}
	};
	
	
	public static final Club[] clubs = {
			new Club(230,30), 
			new Club(215,20), 
			new Club(180,20), 
			new Club(170,17), 
			new Club(155,15), 
			new Club(145,15),
			new Club(135,15),
			new Club(125,15),
			new Club(110,10),
			new Club(50,10)
	};
	public static final Course[] courses = { 
			new Course("Genesee Valley Park North",c1array), new Course("Old Course at St. Andrews",c2array)
	};
}


