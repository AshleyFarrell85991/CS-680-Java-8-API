package edu.cs.cs680.hw13;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Sort implements Command{
	LinkedList<FSElement> children;
	FSElement fe;
	ApfsFileSystem fs = ApfsFileSystem.getInstance();
	private String cmdline;

	  public Sort(String cmdline) {
		  
		  this.cmdline = cmdline;
			ApfsFileSystem fs = ApfsFileSystem.getInstance();

	  }
	
	
	
	
	@Override
	public void execute() {
LinkedList<FSElement> childrens = new LinkedList<FSElement>();
childrens.addAll((Collection<? extends FSElement>) fs.getCurrentDirectory().getChildren().clone());

		if (this.cmdline.contentEquals("")) {

		} else if (this.cmdline.contentEquals("Alphabetical")) {
			Collections.sort(childrens, new AlphabeticalSort());
		     fs.ShowAllElements();

		} else if (this.cmdline.contentEquals("TimeStamp")) {
			Collections.sort(childrens, new TimeStampComparator());
		     fs.ShowAllElements();

		} else if (this.cmdline.contentEquals("Owner")) {
			Collections.sort(childrens, new OwnerSort());
		     fs.ShowAllElements();

		
		
		return ;
		
//		ApfsDirectory current = fs.getCurrentDirectory();
//		LinkedList<FSElement> children = current.getChildren();
//		Collections.sort(children, Comparator.comparing(
//				(FSElement f)-> f.getName()).reversed());
//	
//		System.out.println("\n");
//		System.out.println("Name Reverse Sorting");
//		for(FSElement f: children)
//			
//		{
//		System.out.println(f.getName()+" , ");}
		
	}

	
	
} }
