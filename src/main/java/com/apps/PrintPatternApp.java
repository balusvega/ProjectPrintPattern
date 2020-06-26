package com.apps;

import com.exceptions.NotAValidLineSize;
import com.interfaces.PrintPyramid;
import com.interfaces.PrintTriangle;
import com.modules.PrintPattern;
import com.modules.PrintPatternByForLoop;
import com.modules.PrintPatternByWhileLoop;

public class PrintPatternApp {

    static int POSITIVE_CASE_1 = 6;
    static int NEGATIVE_CASE_1 = -1;
    static int NEGATIVE_CASE_2 = 0;

    public static void main(String[] args) throws NotAValidLineSize {

        int lineSize = 3;
        PrintPattern aPrintPattern = new PrintPatternByForLoop();
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:1 Validating super class star pyramid method by for loop");
            aPrintPattern.starPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:2 Validating super class start triangle method by for loop");
            aPrintPattern.starTriangle(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:3 Validating super class num pyramid method by for loop");
            aPrintPattern.numPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:4 Validating super class num triangle method by for loop");
            aPrintPattern.numTriangle(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        lineSize = -1;
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:5 Validating throw exception from super class star pyramid method by for loop");
            aPrintPattern.starPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:6 Validating throw exception from super class start triangle method by for loop");
            aPrintPattern.starTriangle(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:7 Validating throw exception from super class num pyramid method by for loop");
            aPrintPattern.numPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:8 Validating throw exception from super class num triangle method by for loop");
            aPrintPattern.numTriangle(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        lineSize = 4;
        aPrintPattern = new PrintPatternByWhileLoop();
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:9 Validating super class star pyramid method by while loop");
            aPrintPattern.starPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:10 Validating super class start triangle method by while loop");
            aPrintPattern.starTriangle(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:11 Validating super class num pyramid method by while loop");
            aPrintPattern.numPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:12 Validating super class num triangle method by while loop");
            aPrintPattern.numTriangle(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        lineSize = -1;
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:13 Validating throw exception from super class star pyramid method by while loop");
            aPrintPattern.starPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:14 Validating throw exception from super class start triangle method by while loop");
            aPrintPattern.starTriangle(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:15 Validating throw exception from super class num pyramid method by while loop");
            aPrintPattern.numPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:16 Validating throw exception from super class num triangle method by while loop");
            aPrintPattern.numTriangle(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        lineSize = 5;
        PrintPyramid aPyramidInterface = new PrintPatternByForLoop();
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:17 Validating interface star pyramid method by for loop");
            aPyramidInterface.starPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:18 Validating interface num pyramid method by for loop");
            aPyramidInterface.numPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        lineSize = -1;
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:19 Validating throw exception from interface star pyramid method by for loop");
            aPyramidInterface.starPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:20 Validating throw exception from interface num pyramid method by for loop");
            aPyramidInterface.numPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        lineSize = 6;
        aPyramidInterface = new PrintPatternByWhileLoop();
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:21 Validating interface star pyramid method by while loop");
            aPyramidInterface.starPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:22 Validating interface num pyramid method by while loop");
            aPyramidInterface.numPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        lineSize = 0;
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:23 Validating throw exception from interface star pyramid method by while loop");
            aPyramidInterface.starPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:24 Validating throw exception from interface num pyramid method by while loop");
            aPyramidInterface.numPyramid(lineSize);
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }

        lineSize = 5;
        PrintTriangle aTriangleInterface = new PrintPatternByForLoop();

        PrintPatternApp.testInterface(aTriangleInterface, 6, "STAR");

        PrintPatternApp.testInterface(aTriangleInterface, 6, "NUM");

        PrintPatternApp.testInterface(aTriangleInterface, 0, "STAR");

        PrintPatternApp.testInterface(aTriangleInterface, 0, "NUM");

        lineSize = 6;
        aTriangleInterface = new PrintPatternByWhileLoop();

        PrintPatternApp.testInterface(aTriangleInterface, PrintPatternApp.POSITIVE_CASE_1, "STAR");

        PrintPatternApp.testInterface(aTriangleInterface, 6, "NUM");

        PrintPatternApp.testInterface(aTriangleInterface, 3, "STAR");

        PrintPatternApp.testInterface(aTriangleInterface, 3, "NUM");

        PrintPatternApp.testInterface(aTriangleInterface, PrintPatternApp.NEGATIVE_CASE_1, "STAR");

        PrintPatternApp.testInterface(aTriangleInterface, 0, "NUM");
    }

    public static void testInterface(PrintTriangle aTriangleInterface, int lineSize, String methodName){
        try {
            System.out.println("");
            System.out.println("");
            System.out.println("TC:24 Validating throw exception from interface num triangle method by while loop");
            switch (methodName) {
                case "NUM":
                    aTriangleInterface.numTriangle(lineSize);
                    break;
                case "STAR":
                    aTriangleInterface.starTriangle(lineSize);
                    break;
            }
        }   catch (NotAValidLineSize exp) {
            System.out.print("Invalid line size value." + "\'" + lineSize + "\'" + " Please provide a valid integer above 0");
        }
    }
}