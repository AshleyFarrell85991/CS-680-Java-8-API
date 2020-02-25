package edu.cs.cs680.hw13;

import java.util.LinkedList;
import java.util.Stack;

public class History implements Command{
	
	
	CommandHistory c;


private String cmdline;

  public History(String cmdline) {
	  
	  this.cmdline = cmdline;
	  
  }



	///print the name of every file directory and link in current directory
	//print get children
	
	public History()
	{
this.c = c;	}
	@Override

	public void execute() {
		
		Stack<Command>commandh;
		  c = CommandHistory.getInstance();
	
          commandh = c.getHistory();		
		while(!commandh.isEmpty())
		{
			System.out.println((commandh.pop().toString()));
		}
		return ;
	}

}
