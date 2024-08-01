
package com.graymatter;

import java.util.Arrays;

public class Classroom {
	
	int classNum;
	int floorNum;
	Student st[];
	
	Classroom() {
		super();
	}
	
	Classroom(int classNum, int floorNum,Student st[]) {
		super();
		this.classNum = classNum;
		this.floorNum = floorNum;
		this.st=st;
	}

	Classroom(int classNum, int floorNum) {
		super();
		this.classNum = classNum;
		this.floorNum = floorNum;
	}

	@Override
	public String toString() {
		return "Classroom [classNum=" + classNum + ", floorNum=" + floorNum + "]";
	}
	
	

}
