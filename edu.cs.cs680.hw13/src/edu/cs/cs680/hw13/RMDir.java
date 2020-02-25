package edu.cs.cs680.hw13;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class RMDir implements Command {
	private LinkedList<FSElement> children;

	FSElement current;
	ApfsDirectory dir;
String d;
	ApfsFileSystem fs = ApfsFileSystem.getInstance();

	APFSElement now;
private String cmdline;

  public RMDir(String cmdline) {
	  
	  this.cmdline = cmdline;
		ApfsFileSystem fs = ApfsFileSystem.getInstance();

  }


	
	
	
	@Override
	public void execute() {

	 dir = (ApfsDirectory) fs.RetrieveElement(cmdline);
	 dir.getParent().removeChild(dir);
	 fs.ShowAllElements();
	 return;
	 

	}
	
}
