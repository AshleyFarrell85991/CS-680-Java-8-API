package edu.cs.cs680.hw13;
import java.util.Comparator;
public class TimeStampComparator implements Comparator<FSElement>{
	public int compare(FSElement f1, FSElement f2) {
		return f1.getCreationTime().compareTo(f2.getCreationTime());
		
		
	}

}
