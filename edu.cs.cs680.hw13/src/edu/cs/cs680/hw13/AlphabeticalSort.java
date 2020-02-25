package edu.cs.cs680.hw13;

import java.util.Comparator;

public class AlphabeticalSort implements  Comparator<FSElement> {

	@Override
	public int compare(FSElement o1, FSElement o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
