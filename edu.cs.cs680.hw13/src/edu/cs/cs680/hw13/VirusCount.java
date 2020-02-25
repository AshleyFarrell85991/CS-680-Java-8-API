package edu.cs.cs680.hw13;

public class VirusCount implements Command {



		ApfsDirectory d;
		
		FSElement fe;
		ApfsDirectory lastDir;

		ApfsFileSystem fs = ApfsFileSystem.getInstance();

	private String cmdline;

	  public VirusCount(String cmdline) {
		  
		  this.cmdline = cmdline;
		  
	  }



		///print the name of every file directory and link in current directory
		//print get children
		
		public VirusCount()
		{
	this.fe = fe;	}
		@Override
		public void execute() {
			VirusCheckingVisitor fsvisitor;

			fsvisitor = new VirusCheckingVisitor();

			ApfsDirectory current = fs.getCurrentDirectory();
	    
			fs.getChildren(current);
			 current.accept(fsvisitor);
	
			System.out.println(fsvisitor.getQuarantined());
			return;
			}
			
			
			

		  ///setting the current directory to input p
			

		
		
		
		
	

}
