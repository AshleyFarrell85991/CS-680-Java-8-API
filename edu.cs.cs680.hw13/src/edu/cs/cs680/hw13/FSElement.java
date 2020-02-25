package edu.cs.cs680.hw13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;



public class FSElement {
	private LinkedList<FSElement> children;

	private String name,owner;
	private LocalDateTime creationTime;
	private int size;

	private LocalDateTime lastmodified;
	protected static ApfsDirectory parent;
	//private LocalTime LocalTime;

	public String getParentName() {
		String d = String.valueOf(parent);
//		//Directory d = new Directory()
while(parent!= null) {
		return parent.getName();}
		return d;
	}
	
	
	public ApfsDirectory getParent() {
		return parent;
		
	}

	public void setParent(ApfsDirectory parent) {
		this.parent = parent;
	}	

	public FSElement(ApfsDirectory parent, String name, int size, LocalDateTime creationTime)
	{
		this.parent = parent;
		this.name = name;
		//this.owner = owner;
		this.size = size;
		LocalDate LocalDate;
		//this.type = type;
		this.creationTime = LocalDateTime.now();
	}
	
	public LocalDateTime getCreationTime() {
		return creationTime;
	}
	
public void accept(FSVisitor v) {
		
		
	}

	public LocalDateTime getLastModified() {
		return lastmodified;
		
	}
	
	
	public void setLastModified() {
		this.lastmodified = lastmodified;
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public int countChildren() {
		//System.out.println("Total child in this directory: "+children.size());
		return children.size();
	}

	public int getTotalSize() {
		
		int total=0;
		
		for(int num=0; num < children.size(); num++)
	      {	    			  
	    	  total+=children.get(num).getSize();
	      }
		System.out.println("getTotalSize: "+total);
		return total;
	

}



	public boolean isLeaf() {
	ApfsDirectory apfs = new ApfsDirectory(null, name, owner, size, creationTime, creationTime);
	
	if(apfs.isLeaf()) return false; 
	else return true;
		
	}


	public String getOwner() {
		// TODO Auto-generated method stub
		return owner;
	}
	
	public  void setOwner(String t) {
		this.owner=owner;
	}


	//abstract public boolean isLeaf();


}

	
	

