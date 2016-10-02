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
	
        public exercise () {
		this.shown=true;
		this.taskText="No task has been loaded";
		this.recordedTimeTakenToSolve=-1;
		this.exerciseFileName="";
		System.out.println("Sup");
	}

	public void showExerciseAttribs() {
		System.out.println("tasktext: " + taskText +"\nShown or not: "+shown+"\n time:" + recordedTimeTakenToSolve + "\n filename: " + exerciseFileName);
	}
	public void readExercise (String exerciseFileName) {
		this.exerciseFileName=exerciseFileName;
		Scanner in = new Scanner(System.in);//"../exercises/"+ exerciseFileName);
		File filename= new File("exercises/"+exerciseFileName);
		System.out.println(filename);
		try
		{
			in = new Scanner(filename);
			while (in.hasNextLine()) {
				String line=in.nextLine();
				System.out.println(line);
			}
		}
		catch (FileNotFoundException ex)
		{
			//Do nothing?
			System.out.println("Error in reading file");
		}
	}
}
