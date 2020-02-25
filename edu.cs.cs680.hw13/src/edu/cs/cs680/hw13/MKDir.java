package edu.cs.cs680.hw13;

import java.time.LocalDateTime;

public class MKDir implements Command {

	
	FSElement current;
	ApfsDirectory dir;
String d;
	ApfsFileSystem fs = ApfsFileSystem.getInstance();

	APFSElement now;
private String cmdline;

  public MKDir(String cmdline) {
	  
	  this.cmdline = cmdline;
		ApfsFileSystem fs = ApfsFileSystem.getInstance();

  }

  ///setting the current directory to input provided 

	
	
	
	@Override
	public void execute() {
		LocalDateTime date3 = LocalDateTime.now();
		ApfsDirectory dir = new ApfsDirectory(fs.getCurrentDirectory(), cmdline, " ", 0,date3, date3);
		fs.addChild(fs.getCurrentDirectory(), dir);
		fs.ShowAllElements();
		return;
	}
	
	
	

}
