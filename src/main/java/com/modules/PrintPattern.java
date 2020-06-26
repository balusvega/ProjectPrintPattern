package com.modules;

import com.exceptions.NotAValidLineSize;

abstract public class PrintPattern {

	abstract public void starTriangle(int size) throws NotAValidLineSize;

	abstract public void starPyramid(int size) throws NotAValidLineSize;

	abstract public void numTriangle(int size) throws NotAValidLineSize;

	abstract public void numPyramid(int size) throws NotAValidLineSize;

}