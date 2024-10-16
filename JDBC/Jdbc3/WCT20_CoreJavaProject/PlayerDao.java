package WCT20_CoreJavaProject;

public class PlayerDao {
	int id,noWickets;
	int score;
	String name,team_name,category;
	
	PlayerDao(){}
	
	PlayerDao(int i,String nm,String tm,String cat,int s,int w){
		id = i;
		name = nm;
		team_name = tm;
		category = cat;
		score = s;
		noWickets = w;
	}

	@Override
	public String toString() {
		return "PlayerDao [id = " + id + ", name=" + name + ", team_name = " + team_name
				 + ", category = " + category +  ", score = " + score + ", noWickets = " + noWickets +"]";
	}
	
	
}
