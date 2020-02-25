package edu.cs.cs680.hw13;

import java.time.LocalDateTime;



public class ApfsFile extends FSElement{
	
	private LocalDateTime lastmodified;
	private String owner;


	public ApfsFile(ApfsDirectory parent, String name, String owner, int size, LocalDateTime creationTime,LocalDateTime lastmodified) 
	{
		super(parent, name,  size,creationTime);
		this.owner = owner;
		this.lastmodified = lastmodified;
		
	}

	
	public boolean isLeaf() {

return true ;
	}

	public void accept(FSVisitor f ) {
		f.visit(this);
	}

} 
