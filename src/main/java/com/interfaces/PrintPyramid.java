package com.interfaces;

import com.exceptions.NotAValidLineSize;

public interface PrintPyramid {
	public void starPyramid(int lineSize) throws NotAValidLineSize;
	public void numPyramid(int lineSize) throws NotAValidLineSize;
}