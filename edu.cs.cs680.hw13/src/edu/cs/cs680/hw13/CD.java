package edu.cs.cs680.hw13;

public class CD implements Command{
	FSElement current;
	ApfsDirectory lastDir;

	ApfsFileSystem fs = ApfsFileSystem.getInstance();

	APFSElement now;
private String cmdline;

  public CD(String cmdline) {
	  
	  this.cmdline = cmdline;
	  
  }

  ///setting the current directory to input provided 
public CD() {
	this.current = current;
	
}
  
  
	@Override
	public void execute()  {
		if(null != this.cmdline && !this.cmdline.isEmpty()) {				
			current =  fs.RetrieveElement(cmdline);
		}
		
		if (current != null)
		{
			if(current  instanceof ApfsDirectory)
			{
				ApfsDirectory d = (ApfsDirectory) current;
				fs.setCurrentDirectory(d);
			}
			else 
			{
				fs.setCurrentDirectory(current.getParent());
			}			
		}
		else
		{
			System.out.println("No Such Directory Exists!!!");
		}
//		Command pwd = new PWD();
//		pwd.execute();		
		return;
	}
}


