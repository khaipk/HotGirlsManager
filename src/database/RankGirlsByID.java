package database;

import java.util.Comparator;

public class RankGirlsByID implements Comparator<HotGirl> {

	@Override
	public int compare(HotGirl o1, HotGirl o2) {
		if(o1.getCode()<o2.getCode())return -1;
		else return 1;
	}

}
