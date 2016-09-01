package de.chandanand.common.program;

/**
 * Created by chand on 7/8/16.
 */
public class ProgramStrategy {

    public static Program getProgram(String programName) {
        Program program = null;
        if ("TriangleClassifier".equalsIgnoreCase(programName))
            program = new TriangleClassifier();
        else if ("EvenOdd".equalsIgnoreCase(programName))
            program = new EvenOdd();
        else if ("LeapYear".equalsIgnoreCase(programName))
            program = new LeapYear();

        return program;
    }
}