//Class implementation of an exercise
//TODO: 
//    - Currently shown indicator
//    - Solution field
//    - Previously recorded time taken
//    - more stuff?
//    - Type of problem (Read code or read output?)
//
import java.io.*;
import java.util.Scanner;

public class exercise
{ 
	private boolean shown;
	private String taskText , exerciseFileName;
	private double recordedTimeTakenToSolve;
	
        void exercise () {
		shown=false;
		taskText="No task has been loaded";
		recordedTimeTakenToSolve=-1;
		exerciseFileName="";
	}

	void readExercise (String exerciseFileName) {
		this.exerciseFileName=exerciseFileName;
		Scanner in = new Scanner("../exercises/"+ exerciseFileName);
	}
}
