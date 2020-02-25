package edu.cs.cs680.hw13;

import java.util.LinkedList;

public class LS implements Command{
	private LinkedList<FSElement> children;
	ApfsDirectory d;
	
	FSElement fe;
	ApfsDirectory lastDir;

	ApfsFileSystem fs = ApfsFileSystem.getInstance();

private String cmdline;

  public LS(String cmdline) {
	  
	  this.cmdline = cmdline;
	  
  }



	///print the name of every file directory and link in current directory
	//print get children
	
	public LS()
	{
this.fe = fe;	}
	@Override
	public void execute() {
		
	
		ApfsDirectory current = fs.getCurrentDirectory();
		LinkedList<FSElement> children = current.getChildren();
		System.out.println("\n");
		System.out.println("Here are the directories"+"  ");
		for(int i=0; i<children.size();i++)
		{
			System.out.println(children.get(i).getName()+",    ");
		}
		System.out.println("\n");
		return ;
	}
		
		
		
	
	
	

}
