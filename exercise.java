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
	private int level;
	private String subject;
	
        public exercise () {
		this.shown=true;
		this.taskText="No task has been loaded";
		this.recordedTimeTakenToSolve=-1;
		this.exerciseFileName="";
		System.out.println("Sup");
	}

	public void showExerciseAttribs() {
		System.out.println("tasktext: " + taskText +"\nShown or not: "+shown+"\n time:" + recordedTimeTakenToSolve + "\n filename: " + exerciseFileName + "\n level: " + level + " \nSubject: " + subject);
	}
	public void readExercise (String exerciseFileName) {
		this.exerciseFileName=exerciseFileName;
		Scanner in = new Scanner(System.in);//"../exercises/"+ exerciseFileName);
		File filename= new File("exercises/"+exerciseFileName);
		//System.out.println(filename);
		try
		{
			in = new Scanner(filename);
			boolean restOfFileIsDescription=false;
			taskText = "";
			while (in.hasNextLine()) {
				String line=in.nextLine();
				int type=checkCurrentLineParameter( line,in);
				if(type==3){
				       	restOfFileIsDescription=true;
					line=in.nextLine();
				}
				if(restOfFileIsDescription) {
					taskText += line;
				}
			}
		}
		catch (FileNotFoundException ex)
		{
			//Do nothing?
			System.out.println("Error in reading file");
		}
	}

	//function returns int indicating type of fileLine
	private int checkCurrentLineParameter(String line, Scanner in){
		int caseNum=0;
		switch(line){
			case "level:":
				caseNum=1;
				level=Integer.parseInt(in.nextLine());
				break;
			case "subject:":
				caseNum=2;
				subject=in.nextLine();
				break;
			case "taskText:":
				caseNum=3;
				break;
			default:
				break;

		}
		return caseNum;
	}
}
