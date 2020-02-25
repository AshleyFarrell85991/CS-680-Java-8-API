package edu.cs.cs680.hw13;

public class Chown implements Command {
	
		

		
		FSElement current;
		ApfsDirectory dir;
	String d;
		ApfsFileSystem fs = ApfsFileSystem.getInstance();

		APFSElement now;
	private String cmdline;

	  public Chown(String cmdline) {
		  
		  this.cmdline = cmdline;
			ApfsFileSystem fs = ApfsFileSystem.getInstance();

	  }

	  ///setting the current directory to input provided 

		
		
		
		@Override
		public void execute() {
			String t [] = cmdline.split(" ");
//			
		FSElement target = fs.RetrieveElement(t[0]);
          target.setOwner(t[1]);	      
	        System.out.println(target.getOwner());
		return;
		}

	
	

}
