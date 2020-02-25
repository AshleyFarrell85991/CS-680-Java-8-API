package edu.cs.cs680.hw13;

import java.util.Stack;

public class Redo implements Command {

	
	
	CommandHistory c;
 Command c2;

private String cmdline;

  public Redo(String cmdline) {
	  
	  this.cmdline = cmdline;
	  
  }



	///print the name of every file directory and link in current directory
	//print get children
	
	public Redo()
	{
this.c = c;	}
	@Override

	public void execute() {
		  c = CommandHistory.getInstance();
	
          c2 = c.getHistory().pop();	
          c2.execute();
		
		
		return ;

}
}