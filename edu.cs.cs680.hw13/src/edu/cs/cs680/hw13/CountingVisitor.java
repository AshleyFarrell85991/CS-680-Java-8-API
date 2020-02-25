package edu.cs.cs680.hw13;


public class CountingVisitor implements FSVisitor {

	private int dirNum=0;
	private int fileNum=0;
	private int linkNum=0;
	
	public void visit(ApfsLink link) {
		linkNum++;
	}
	
	public void visit(ApfsDirectory dir) {
		dirNum++;
	}

	@Override
	public void visit(ApfsFile file) {
fileNum++;	
	}
	
	public int getDirNum() {
		return this.dirNum;
		
	}
	
	public int getlinkNum() {
		return this.linkNum;
	}
	
	
	public int getFileNum() {
		return this.fileNum;
	}

}
