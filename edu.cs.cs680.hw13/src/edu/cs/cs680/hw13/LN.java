package edu.cs.cs680.hw13;

import java.time.LocalDateTime;

public class LN implements Command{

	
	FSElement current;
	ApfsDirectory dir;
String d;
	ApfsFileSystem fs = ApfsFileSystem.getInstance();

	APFSElement now;
private String cmdline;
private String cmdline2;
private FSElement target;

  public LN(String cmdline) {
	  
	  this.cmdline = cmdline;
		ApfsFileSystem fs = ApfsFileSystem.getInstance();

  }

  ///setting the current directory to input provided 

	
	
	
	@Override
	public void execute() {
		String t [] = cmdline.split(" ");
//		
	FSElement target = fs.RetrieveElement(t[0]);
//		
	LocalDateTime date3 = LocalDateTime.now();
	ApfsLink link = new ApfsLink(fs.getCurrentDirectory(),t[1],"",0,date3,date3,target);
fs.addChild(fs.getCurrentDirectory(), link);
	fs.ShowAllElements();
	return;
	}
	
 }
