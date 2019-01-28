package database;

import java.util.Comparator;

public class RankGirls implements Comparator<HotGirl>{

	@Override
	public int compare(HotGirl thisGirl, HotGirl thatGirl) {
		if(thisGirl.getAge()<thatGirl.getAge()) return -1;
		else return 1;
	}
	

}
