package edu.cs.cs680.hw13;

import java.util.Comparator;

public class OwnerSort implements Comparator<FSElement>{
	public int compare(FSElement f1, FSElement f2) {
		return f1.getOwner().compareTo(f2.getOwner());
		
		
	}

}
