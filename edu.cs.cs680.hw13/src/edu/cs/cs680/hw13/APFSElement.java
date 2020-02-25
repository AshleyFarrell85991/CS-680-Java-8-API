package edu.cs.cs680.hw13;

import java.time.LocalDateTime;



public  class APFSElement extends FSElement {



private static APFSElement instance = null;
private static String name;
private static int size;
private static LocalDateTime creationTime;
public ApfsDirectory root;
private String owner;
private LocalDateTime lastmodified;

public ApfsDirectory getRoot() {
	return root;
}

public void setRoot(ApfsDirectory root) {
	this.root = root;
}



public APFSElement() {
	super(parent,name,size,creationTime);
	
	this.owner = owner;
  this.lastmodified = lastmodified;
}

public static APFSElement getAPFSElement()
{
	if(instance == null) 
	{
		instance = new APFSElement();
	}
	return instance;
}




	
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}



	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	


	public LocalDateTime getModifiedTime() {
		// TODO Auto-generated method stub
		return lastmodified;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

}
