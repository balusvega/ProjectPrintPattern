package com.interfaces;

import com.exceptions.NotAValidLineSize;

public interface PrintTriangle {
	public void starTriangle(int lineSize) throws NotAValidLineSize;
	public void numTriangle(int lineSize) throws NotAValidLineSize;
}