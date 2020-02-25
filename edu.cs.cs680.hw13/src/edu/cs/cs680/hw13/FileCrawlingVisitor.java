package edu.cs.cs680.hw13;

import java.util.ArrayList;


public class FileCrawlingVisitor implements FSVisitor {
	ArrayList<ApfsFile> f = new ArrayList<ApfsFile>();

//private ArrayList<File>() files;
private int indexednum=0;

public void visit(ApfsLink link) {
return;	
}

@Override
public void visit(ApfsDirectory dir) {
return;	
}

public void visit(ApfsFile file) {
	//ArrayList<File> f = new ArrayList<File>();

	f.add(file); 
}

public ArrayList<ApfsFile> getFiles() {
	
return this.f;
}

//
//public ArrayList<String> getNames() {
//	for(int i =0; i < f.size(); i++) 
//	{   
//}




}
