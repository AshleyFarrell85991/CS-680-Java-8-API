package edu.cs.cs680.hw13;

public class CP implements Command{
	

	
	FSElement current;
	ApfsDirectory dir;
String d;
	ApfsFileSystem fs = ApfsFileSystem.getInstance();

	APFSElement now;
private String cmdline;

  public CP(String cmdline) {
	  
	  this.cmdline = cmdline;
		ApfsFileSystem fs = ApfsFileSystem.getInstance();

  }

  ///setting the current directory to input provided 

	
	
	
	@Override
	public void execute() {
		String t [] = cmdline.split(" ");
//		
	FSElement target = fs.RetrieveElement(t[0]);
     dir = (ApfsDirectory) fs.RetrieveElement(t[1]);
      
    fs.addChild(dir, target);
		fs.ShowAllElements();
	return;
	}

}
