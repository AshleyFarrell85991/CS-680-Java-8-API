package edu.cs.cs680.hw13;

public class Crawl implements Command{
	

	ApfsDirectory d;
	
	FSElement fe;
	ApfsDirectory lastDir;

	ApfsFileSystem fs = ApfsFileSystem.getInstance();

private String cmdline;

  public Crawl(String cmdline) {
	  
	  this.cmdline = cmdline;
	  
  }



	///print the name of every file directory and link in current directory
	//print get children
	
	public Crawl()
	{
this.fe = fe;	}
	
	public void execute() {
		FileCrawlingVisitor fsvisitor;
		fsvisitor = new FileCrawlingVisitor();

		ApfsDirectory current = fs.getCurrentDirectory();
    
		fs.getChildren(current);
		 current.accept(fsvisitor);
		System.out.println(fsvisitor.getFiles().size());
		return;
		}
		
}
