package edu.cs.cs680.hw13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;


public class ApfsDirectory extends FSElement {
	private ApfsFileSystem apfs;
	private LinkedList<FSElement> children;
	private LocalDateTime creationTime;
	private int size;
	private String owner;
	private LocalDateTime lastmodified;
	private String name;
	public ApfsDirectory parent;

	public ApfsDirectory(ApfsDirectory parent, String name, String owner, int size, LocalDateTime creationTime,LocalDateTime lastmodified) {
		super(parent, name,0, creationTime);
children = new LinkedList<FSElement>();
		
		this.parent = parent;
		this.name = name;
		this.size=size;
		this.creationTime = creationTime;
		this.lastmodified = lastmodified;
		this.owner = owner;

		
		// TODO Auto-generated constructor stub
	}

	public LinkedList<FSElement> getChildren()
	{
		return this.children;
	}
	public void addChild(FSElement child,int index)
	{		
		children.add(index,child);
		
	}
	public void appendChild(FSElement child,int index)
	{		
addChild(child,apfs.getInsertionLocation(this, child));	
	}
	
	
	
	public void removeChild(FSElement child) {
		children.remove(child);
		
	}
	
	
	public int countChildren() {
		//System.out.println("Total child in this directory: "+children.size());
		return children.size();
	}
	

	
	public String getName () {
		return this.name;
		
	}
	
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

	public String getOwner() {
		return owner;
		
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
	

	
	public int getSize() {
		return size;
	}
	
	
	public LocalDateTime getCreationTime(ApfsDirectory d) {
		
		 return d.getCreationTime();
	}
	
	public LocalDateTime getLastModified(ApfsDirectory d) {
		
		 return d.getModifiedTime();
	}
	
	

	public void setName (String name) {
		this.name = name;
		
	}
	
	public void setOwner (String owner) {
		this.owner = owner;
		
	}
	
	public void setParent(ApfsDirectory parent) {
		this.parent = parent;
		
	}
	
	
public boolean isLeaf() {
	
	return false;
}
	
public LocalDateTime getModifiedTime() {
	return this.lastmodified;
	
}
	
public void accept(FSVisitor f) {
	f.visit(this);
	for (FSElement d : children)
	{
		d.accept(f);
	}
}





//public static String[] dirToStringArray(ApfsDirectory d) {
//
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
//	
//	String formatDateTime = d.getCreationTime().format(formatter);
//	String formatmodified = d.getModifiedTime().format(formatter);
//	String [] dirinfo = {String.valueOf(d.isLeaf()),d.getName().toString(),d.getOwner(),formatDateTime,formatmodified,d.getParent(),String.valueOf(d.countChildren())};
//	
//	//System.out.println("This is the array"+dirinfo);
//	return dirinfo;
////still need to format parent
//	
//}

public FSElement getChildUsingName(String name) {		
	for(FSElement f:this.children){
	if(f.getName().contentEquals(name)){			
System.out.println(f.getName()+name);
	return f;
}
//	
}
return null;
//	
} 
public ApfsDirectory getChildDirUsingName(String dirName) {
	ApfsDirectory dir=null;
for(FSElement f:this.children){
	if(f.getName().contentEquals(dirName) && f instanceof ApfsDirectory){			
	dir=(ApfsDirectory) f;
	return dir;
	}
//	
	}
return dir;
//	
}  }

