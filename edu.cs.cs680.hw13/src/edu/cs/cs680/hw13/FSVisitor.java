package edu.cs.cs680.hw13;


public interface FSVisitor {
	public void visit(ApfsLink link);
	public void visit(ApfsDirectory dir);
	public void visit(ApfsFile file);
		
}
