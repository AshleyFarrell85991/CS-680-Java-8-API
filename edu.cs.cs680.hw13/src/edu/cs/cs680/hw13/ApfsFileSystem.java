package edu.cs.cs680.hw13;

import java.nio.file.InvalidPathException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;




public class ApfsFileSystem {

	private static ApfsFileSystem instance = null;
	private ApfsDirectory root;
	private ApfsDirectory current;
	private String name;
	LinkedList<ApfsDirectory> children;
//ArrayList<FSElement> children;
	// Constructor this class is singleton so private constructor
	ApfsFileSystem() {
		this.root = new ApfsDirectory(null, "root", "Ashley", 0, null, null);
		this.current = this.root;
	}

	// Gives Unique instance
public static ApfsFileSystem getInstance() {
	if (instance == null) {
		instance = new ApfsFileSystem();
	}
	return instance;
	}


public void addChild(ApfsDirectory parent, FSElement child) {
	
	parent.addChild(child, getInsertionLocation(parent,child));
	
}




	public int countChildren(){
		
		return children.size();
		
		
	}


	

	public int getInsertionLocation(ApfsDirectory parent, FSElement child) {

		LinkedList<FSElement> children;
		children = parent.getChildren();
		ListIterator<FSElement> li = children.listIterator(children.size());
		for (int i = 0; i < children.size(); i++) {
			if (children.get(i).getName().compareTo(child.getName()) > 0) {

				return i;
			}
		}
		return children.size();
	}
	
	
	public LinkedList<FSElement> getChildren(ApfsDirectory current)
{
	return this.current.getChildren();
}
	
	
	// All getter Setter
	public ApfsDirectory getRoot() {
		return root;
	}

	public void setRoot(ApfsDirectory root) {
		this.root = root;
	}

	public ApfsDirectory getCurrentDirectory() {
		return current;
	}

	public void setCurrentDirectory(ApfsDirectory current) {
		this.current = current;
	}

	

	
	
	
	
	public FSElement RetrieveElement(String s) {

		FSElement f = null;
		ApfsDirectory c = current;


/////remove whitespace
   s = s.trim();
      
           
           
			if (s.contains("..")) {
				f = this.getCurrentDirectory().getParent();
				if (f != null) {
					return f;
				} else {
					throw new IllegalArgumentException("error");
				}
			} else {
				f = this.getCurrentDirectory().getChildUsingName(s);
				if (f != null) {
					return f;
				} else {
					throw new IllegalArgumentException(
							"nothing exists");
				}
			}
			
			
			
			
		
	}
	
	
	

	
	public void ShowAllElements() {

		ApfsFileSystem fs = ApfsFileSystem.getInstance();

		ApfsDirectory current = fs.getCurrentDirectory();
		LinkedList<FSElement> children = current.getChildren();
		
		for(FSElement f: children)
			
		{
		System.out.println(f.getName()+" , "+ f.getCreationTime()+" ,"+f.getOwner());}
				
		
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void setName() {
		this.name = name;
		
	}

	public void createFileSystem() {
		LocalDateTime date3 = LocalDateTime.now().plusMinutes(6);
		LocalDateTime date4 = LocalDateTime.now().plusMinutes(7);

		ApfsFileSystem fs = getInstance();
		ApfsDirectory root = fs.getRoot();
		ApfsDirectory home = new ApfsDirectory(root, "home","Chris Ownes",0, date3,date4);
		ApfsDirectory system = new ApfsDirectory(root, "system", "Rodger Rabbit",0, date3,date4);
		ApfsDirectory pictures = new ApfsDirectory(home, "pictures", "Betty Boop", 0, date4, date4);
		ApfsDirectory applications = new ApfsDirectory(pictures, "applications", "Betty Boop", 0, date4, date4);
		ApfsFile a = new ApfsFile(system, "a", "Mom", 5, date4, date4);
		ApfsFile b = new ApfsFile(system, "b", "DAD", 10, date4, date4);
		ApfsFile c = new ApfsFile(system, "c", "Tommy", 100, date4, date4);
		ApfsFile d = new ApfsFile(home, "d", "BIlly", 1, date4, date4);
		ApfsFile e = new ApfsFile(pictures, "e", "Youngin", 90, date4, date4);
		ApfsFile f = new ApfsFile(pictures, "f", "Tammy", 20, date4, date4);
		ApfsLink x = new ApfsLink(home, "x", "Lammy", 0, date4, date4, system);
		ApfsLink y = new ApfsLink(pictures, "y", "Kim K", 0, date4, date4, x);

		fs.setRoot(root);
		fs.addChild(root, home);
		fs.addChild(root, system);
        fs.addChild(home, applications);

		fs.addChild(system, a);
		fs.addChild(system, b);
		fs.addChild(system, c);

		fs.addChild(home, d);
		fs.addChild(home, x);
		fs.addChild(home, pictures);

		fs.addChild(pictures, e);
		fs.addChild(pictures, f);
		fs.addChild(pictures, y);

		System.out.println(fs.getChildren(root));
		fs.ShowAllElements();
		return;
	}




}