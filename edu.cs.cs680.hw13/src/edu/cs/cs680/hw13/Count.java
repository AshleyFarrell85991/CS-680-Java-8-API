package edu.cs.cs680.hw13;


import java.util.LinkedList;


public class Count implements Command{
	private LinkedList<FSElement> children;
	ApfsDirectory d;
	
	FSElement fe;
	ApfsDirectory lastDir;

	ApfsFileSystem fs = ApfsFileSystem.getInstance();

private String cmdline;

  public Count(String cmdline) {
	  
	  this.cmdline = cmdline;
	  
  }



	///print the name of every file directory and link in current directory
	//print get children
	
	public Count()
	{
this.fe = fe;	}
	@Override
	public void execute() {
		CountingVisitor fsvisitor;
		fsvisitor = new CountingVisitor();

		ApfsDirectory current = fs.getCurrentDirectory();
    
		fs.getChildren(current);
		 current.accept(fsvisitor);
	
		System.out.println(fsvisitor.getDirNum()+" "+fsvisitor.getlinkNum()+" "+
				fsvisitor.getFileNum());
		return;
		}
		
		
		

	  ///setting the current directory to input provided 

		
		
		

	
	
	
	
}
