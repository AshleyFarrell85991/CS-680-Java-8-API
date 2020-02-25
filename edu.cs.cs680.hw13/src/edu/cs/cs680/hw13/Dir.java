package edu.cs.cs680.hw13;

import java.util.LinkedList;

public class Dir implements Command{

	private LinkedList<FSElement> children;
	ApfsDirectory d;
	private ApfsFileSystem f;
	String cmdline;

	///print the name of every file directory and link in current directory
	//print get children
	
	  public Dir(String cmdline) {
		  
		  this.cmdline = cmdline;
		  
	  }
	
	public Dir()
	{
		this.d = d;

	}
	@Override
	public void execute() {
		f = ApfsFileSystem.getInstance();

		ApfsDirectory current = f.getCurrentDirectory();
		LinkedList<FSElement> children = current.getChildren();
		
		for(int i=0; i<children.size();i++)
		{
			System.out.println(children.get(i).getName()+", "+children.get(i).getOwner()+","+children.get(i).getCreationTime()
					+","+children.get(i).getLastModified()+","+children.get(i).getSize()+children.get(i).isLeaf());
		}
		System.out.println("\n");
		return ;
	}
}
