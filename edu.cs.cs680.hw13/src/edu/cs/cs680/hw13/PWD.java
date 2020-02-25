package edu.cs.cs680.hw13;

import java.util.ArrayList;

public class PWD implements Command {
	private ApfsFileSystem f; 
	//private String s;
	public PWD()
	{
		f = ApfsFileSystem.getInstance();
	}
	
	@Override
	public void execute() 
	{
		ApfsDirectory cur = f.getCurrentDirectory();	
		ArrayList<String> path=new ArrayList<String>();		
		while(cur!=null){			
			path.add(cur.getName());
			cur=cur.getParent();
		}
		for(int i=path.size()-1;i>=0;i--){
			System.out.print(path.get(i));
		}
	}
	

}
