package edu.cs.cs680.hw13;


public class VirusCheckingVisitor implements FSVisitor {
	private int quarantined=0;

	@Override
	public void visit(ApfsLink link) {
return;		
	}

	@Override
	public void visit(ApfsDirectory dir) {
return;		
	}

	@Override
	public void visit(ApfsFile file) {
		
		System.out.println("Checked for Virus");
		quarantined++;

		
	}
	
	public int getQuarantined() {
		return this.quarantined;
	}
	
	
	
}