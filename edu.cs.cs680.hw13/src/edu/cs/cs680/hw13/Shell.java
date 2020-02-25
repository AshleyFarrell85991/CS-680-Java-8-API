package edu.cs.cs680.hw13;

import java.util.Scanner;

public class Shell {
	private static CommandHistory commandhistory = CommandHistory.getInstance();
	
	public Shell()
	{
		commandhistory = CommandHistory.getInstance();
	}
	public static void main(String[] args) throws Exception
	{
		ApfsFileSystem fs = new ApfsFileSystem().getInstance();
		fs.createFileSystem();
		

		System.out.println("This is Ashley's Shell");
		System.out.println("Please see commands below"+"\n");
		System.out.println("PWD,CD,LS,DIR,MKDIR,RMDIR,LN,LS,MV,CP,CHOWN,HISTORY,SORT(Alphabetical)");
		System.out.println("Count(FileCountVisitor)"+" "+ "CRAWL(FileCrawlVisitor)"+"VirusCount");

		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("\n");
			Command pwd = new PWD();
			pwd.execute();
			System.out.println(" Shell>");
			String commandStr = in.nextLine().trim();
			//System.out.println(command);
			execute(commandStr);
		}
	}
	public static void execute(String s)	
	{	
		String command[] = s.split(" ");
		int len = command.length;
		Command commandInstance = null;
		String c = command[0].toUpperCase();
		//System.out.println(c);
		if(c.contains("PWD"))
		{			
			commandInstance = new PWD();			
		}		
		else if(c.equalsIgnoreCase("CD") && (len==1)) 
		{
			commandInstance = new CD();			
		}
		else if(c.equalsIgnoreCase("CD") && len>1)
		{	
			commandInstance = new CD(command[1]);	}	
	
	else if(c.equalsIgnoreCase("LS"))
	{
		commandInstance = new LS();			
		}
		else if(c.equalsIgnoreCase("DIR") && len>1)
		{			
		commandInstance = new Dir(command[1]);			
	}
	else if(c.equalsIgnoreCase("DIR")&& len == 1)
	{
		commandInstance = new Dir();			
	}
	else if(c.equalsIgnoreCase("MKDIR") && len>1)
{		
	commandInstance = new MKDir(command[1]);
}		
	else if(c.equalsIgnoreCase("RMDIR") && len>1)
	{			
		commandInstance = new RMDir(command[1]);			
	}	
		
	else if(c.equalsIgnoreCase("LN") && len>2)
	{System.out.println("Enter target name and then link name with a space between");

	commandInstance = new LN(command[1] +" "+ command[2]);			
	}
 else if(c.equalsIgnoreCase("MV") && len>2)
	{   System.out.println("Enter the file/dir you want to move and then destination with space between");
		commandInstance = new MV (command[1] +" "+ command[2]);			
	}
	else if(c.equalsIgnoreCase("CP") && len>2)
	{System.out.println("Enter the file/dir you want to copy and then destination with space between");
		commandInstance = new CP (command[1] +" "+ command[2]);			
	}
		else if(c.equalsIgnoreCase("CHOWN") && len==2)
	{	System.out.println("Enter the file/dir you want to change the owner of");
		commandInstance = new Chown(command[1]);	
	}else if(c.equalsIgnoreCase("CHOWN") && len==3)
	{
		commandInstance = new Chown(command[1] +" "+ command[2]);	
	}
	else if(c.equalsIgnoreCase("HISTORY"))
		{
		commandInstance =new History();			
	}
	else if(c.equalsIgnoreCase("REDO"))
	{
		commandInstance =new Redo();			
	}		
	else if(c.equalsIgnoreCase("SORT") && len>1)
	{			
		commandInstance =new Sort(command[1]);			
	}
	else if(c.equalsIgnoreCase("SORT") && len==1)
	{
		commandInstance = new Sort("");
	}else if(c.equalsIgnoreCase("SHOW")){
		ApfsFileSystem.getInstance().ShowAllElements();
	}
	else if(c.equalsIgnoreCase("CRAWL"))
	{
		commandInstance = new Crawl();			
		}
	else if(c.equalsIgnoreCase("VIRUSCOUNT"))
	{
		commandInstance = new VirusCount();			
		}
		
	else if(c.equalsIgnoreCase("COUNT"))
	{
		commandInstance = new Count();			
		}
		
		
	
	
		else{
			System.out.println("Invalid Command");

			return;
		}
		try {
			if(commandInstance != null) {
				commandInstance.execute();
			commandhistory.push(commandInstance);			
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid");
			System.out.println(e);
		}
		
		
		
	}  }