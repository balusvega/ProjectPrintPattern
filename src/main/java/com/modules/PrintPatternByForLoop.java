package com.modules;

import com.exceptions.NotAValidLineSize;
import com.interfaces.PrintPyramid;
import com.interfaces.PrintTriangle;

public class PrintPatternByForLoop extends PrintPattern implements PrintPyramid, PrintTriangle {

	@Override
	public void starTriangle(int LineSize) throws NotAValidLineSize {
		if (LineSize < 0){
			throw new NotAValidLineSize();
		} else {
			System.out.println("");
			System.out.println("Star triangle of size " + LineSize + " is printed below");
			for (int counter = 1; counter <= LineSize; counter++) {
				System.out.println("");
				for (int subCount = 1; subCount <= counter; subCount++) System.out.print("*" + " ");
			}
		}
	}

	@Override
	public void starPyramid(int LineSize) throws NotAValidLineSize {
		if (LineSize < 0) {
			throw new NotAValidLineSize();
		} else {
			System.out.println("");
			System.out.println("Star pyramid of size " + LineSize + " is printed below");
			for (int counter = 1; counter <= LineSize; counter++) {
				System.out.println("");
				for (int subCount = 1; subCount <= (LineSize - counter); subCount++) {
					System.out.print(" ");
				}
				for (int nmCount = 1; nmCount <= counter; nmCount++) {
					System.out.print("*" + " ");
				}
			}
		}
	}

	@Override
	public void numTriangle(int LineSize) throws NotAValidLineSize {
			if (LineSize < 0){
				throw new NotAValidLineSize();
			} else {
				System.out.println("");
				System.out.println("Number triangle of size " + LineSize + " is printed below");
				for (int counter = 1; counter <= LineSize; counter++) {
					System.out.println("");
				for (int subCount = 1; subCount <= counter; subCount++) {
					System.out.print(subCount + " ");
				}
			}
		}
	}

	@Override
	public void numPyramid(int LineSize) throws NotAValidLineSize {
		if (LineSize < 0) {
			throw new NotAValidLineSize();
		} else {
			System.out.println("");
			System.out.println("Num pyramid of size " + LineSize + " is printed below");
			for (int counter = 1; counter <= LineSize; counter++) {
				System.out.println("");
				for (int subCount = 1; subCount <= (LineSize - counter); subCount++) {
					System.out.print(" ");
				}
				for (int nmCount = 1; nmCount <= counter; nmCount++) {
					System.out.print(nmCount + " ");
				}
			}
		}
	}
//
//	@Override
//	public void intStarPyramids(int LineSize) throws NotAValidLineSize {
//		if (LineSize < 0) {
//			throw new NotAValidLineSize();
//		} else {
//			System.out.println("");
//			System.out.println("Star pyramid of size " + LineSize + " is printed below");
//			for (int counter = 1; counter <= LineSize; counter++) {
//				System.out.println("");
//				for (int subCount = 1; subCount <= (LineSize - counter); subCount++) {
//					System.out.print(" ");
//				}
//				for (int nmCount = 1; nmCount <= counter; nmCount++) {
//					System.out.print("*" + " ");
//				}
//			}
//		}
//	}
//
//	@Override
//	public void intNumPyramids(int LineSize) throws NotAValidLineSize {
//		if (LineSize < 0) {
//			throw new NotAValidLineSize();
//		} else {
//			System.out.println("");
//			System.out.println("Num pyramid of size " + LineSize + " is printed below");
//			for (int counter = 1; counter <= LineSize; counter++) {
//				System.out.println("");
//				for (int subCount = 1; subCount <= (LineSize - counter); subCount++) {
//					System.out.print(" ");
//				}
//				for (int nmCount = 1; nmCount <= counter; nmCount++) {
//					System.out.print(nmCount + " ");
//				}
//			}
//		}
//	}
}