package com.modules;

import com.exceptions.NotAValidLineSize;
import com.interfaces.PrintPyramid;
import com.interfaces.PrintTriangle;

public class PrintPatternByWhileLoop extends PrintPattern implements PrintTriangle, PrintPyramid {

	@Override
	public void starTriangle(int LineSize) throws NotAValidLineSize {
		if (LineSize < 0){
			throw new NotAValidLineSize();
		} else {
			System.out.println("");
			System.out.println("Star triangle of size "+ LineSize + " is generated as below using while loop");
			int counter = 1;
			while(counter <= LineSize){
				System.out.println("");
				int subCounter = 1;
				while(subCounter <= counter){
					System.out.print("*" + " ");
					subCounter++;
				}
				counter++;
			}
		}
	}

	@Override
	public void starPyramid(int LineSize) throws NotAValidLineSize {
		if (LineSize < 0) {
			throw new NotAValidLineSize();
		} else {
			System.out.println("");
			System.out.println("Star pyramid of size "+ LineSize + " is generated as below using while loop");
			int counter =1;
			while(counter<=LineSize){
				System.out.println("");
				int subCounter = 1;
				while(subCounter<=(LineSize-counter)){
					System.out.print(" ");
					subCounter++;
				}
				int nmCount = 1;
				while(nmCount<=counter){
					System.out.print("*" + " ");
					nmCount++;
				}
				counter++;
			}
		}
	}

	@Override
	public void numTriangle(int LineSize) throws NotAValidLineSize {
		if (LineSize < 0){
			throw new NotAValidLineSize();
		} else {
			System.out.println("");
			System.out.println("Number triangle of size "+ LineSize + " is generated as below using while loop");
			int counter =1;
			while(counter<=LineSize){
				System.out.println("");
				int subCounter = 1;
				while(subCounter<=counter){
					System.out.print(subCounter + " ");
					subCounter++;
				}
				counter++;
			}
		}
	}

	@Override
	public void numPyramid(int LineSize) throws NotAValidLineSize {
		if (LineSize < 0) {
			throw new NotAValidLineSize();
		} else {
			System.out.println("");
			System.out.println("Number pyramid of size "+ LineSize + " is generated as below using while loop");
			int counter =1;
			while(counter<=LineSize){
				System.out.println("");
				int subCounter = 1;
				while(subCounter<=(LineSize-counter)){
					System.out.print(" ");
					subCounter++;
				}
				int nmCount = 1;
				while(nmCount<=counter){
					System.out.print(nmCount + " ");
					nmCount++;
				}
				counter++;
			}
		}
	}
//	@Override
//	public void intStarTriangle(int LineSize) throws NotAValidLineSize {
//		if (LineSize < 0){
//			throw new NotAValidLineSize();
//		} else {
//			System.out.println("");
//			System.out.println("Star triangle of size " + LineSize + " is printed below");
//			for (int counter = 1; counter <= LineSize; counter++) {
//				System.out.println("");
//				for (int subCount = 1; subCount <= counter; subCount++) System.out.print("*" + " ");
//			}
//		}
//	}
//
//	@Override
//	public void intNumTriangle(int LineSize) throws NotAValidLineSize {
//		if (LineSize < 0){
//			throw new NotAValidLineSize();
//		} else {
//			System.out.println("");
//			System.out.println("Number triangle of size " + LineSize + " is printed below");
//			for (int counter = 1; counter <= LineSize; counter++) {
//				System.out.println("");
//				for (int subCount = 1; subCount <= counter; subCount++) {
//					System.out.print(subCount + " ");
//				}
//			}
//		}
//	}
}