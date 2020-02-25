package edu.cs.cs680.hw13;

public class SizeSort implements Comparator{
	
	public int compare(FSElement f1, FSElement f2) {
		// TODO Auto-generated method stub
		return (f1.getSize() - f2.getSize());
	} 
}
