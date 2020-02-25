package edu.cs.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class APFSTest {

	@Test
	void test() {

		LocalDateTime date3 = LocalDateTime.now().plusMinutes(6);
		LocalDateTime date4 = LocalDateTime.now().plusMinutes(7);
	    ApfsFileSystem fs = new ApfsFileSystem();
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
 
int expected= 3;

assertSame(expected,pictures.countChildren());

		
	}

	
	@Test
	void getInsertionLocation() {

		LocalDateTime date3 = LocalDateTime.now().plusMinutes(6);
		LocalDateTime date4 = LocalDateTime.now().plusMinutes(7);
	    ApfsFileSystem fs = new ApfsFileSystem();
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
		int expected = 3;
assertSame(3,fs.getInsertionLocation(system,c));
//assertSame(expected,fs.countChildren());

		
	}
	
	@Test
	void getCurrentDir() {

		LocalDateTime date3 = LocalDateTime.now().plusMinutes(6);
		LocalDateTime date4 = LocalDateTime.now().plusMinutes(7);
	    ApfsFileSystem fs = new ApfsFileSystem();
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
		String expected = "root";
assertSame(expected,fs.getCurrentDirectory().getName());
//assertSame(expected,fs.countChildren());

		
	}



	
	
	
}
