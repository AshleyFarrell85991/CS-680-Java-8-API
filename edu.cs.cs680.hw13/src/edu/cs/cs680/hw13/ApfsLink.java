package edu.cs.cs680.hw13;

import java.time.LocalDateTime;




public class ApfsLink extends FSElement{

	private FSElement target;
	private String owner;
	private LocalDateTime lastmodified;

	public ApfsLink(ApfsDirectory parent, String name, String owner, int size, LocalDateTime creationTime,LocalDateTime lastmodified,FSElement target) {
		super(parent, name, 0, creationTime);
		this.target = target;	
		this.setOwner(owner);
		this.lastmodified = lastmodified;}

	
	public boolean isLeaf() {
		
		return true;
	}
	

	public FSElement getTarget() {
		
		return target;
	}
	
	public int getTargetSize() {
		return this.target.getSize();
		
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void accept(FSVisitor f) {
		f.visit(this);
		
	}

	
}
	
	