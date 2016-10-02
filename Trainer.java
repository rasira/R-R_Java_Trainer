
public class Trainer
{ 

	public static void main(String [] args)
	{
		//Test reads:
		exercise testExercise = new exercise();

		testExercise.showExerciseAttribs();


		testExercise.readExercise("writeIF.task");
		testExercise.showExerciseAttribs();


		//Tests array of exercise, listExercises
		listExercises list = new listExercises();
		list.showProperties();

	}

}
