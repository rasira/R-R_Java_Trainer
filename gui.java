import java.awt.*;
import java.awt.event.*;

public class gui extends Frame 
	implements WindowListener, ActionListener {

	//Removes warning considering serializable class Frame
	private static final long serialVersionUID = 1239428184;
    //Button for windowType=1
    private Button mainWindowBtn;
    //Show text from file etc:
    final TextArea showExercise, writeAnswerTextBox;

    //Keep track of type of training/tool used
    private int windowTypeButton=1; //for instance: 1=Standard, 2=snippet tool, 3= who knows tool

    

	public gui () {
        Panel topMenu = new Panel(new GridLayout(3,3));

        //Adds an exercise button to the screen
        mainWindowBtn = new Button("Exercises");
        mainWindowBtn.addActionListener(this);
        //Add to window topMenu
        topMenu.add(mainWindowBtn);
         

        //Make exercise and answer boxes
        showExercise = new TextArea(10,20);
        writeAnswerTextBox = new TextArea(10,20);
        showExercise.setEditable(false);

        Panel exercisesAndAnswers = new Panel(new GridLayout(4,2));
        //Add to this Panel in order top to bot
        exercisesAndAnswers.add(new Label("Exercise 1"));
        exercisesAndAnswers.add(new Label(" "));
        exercisesAndAnswers.add(showExercise);
        exercisesAndAnswers.add(new Label(" "));
        exercisesAndAnswers.add(new Label("Your answer"));
        exercisesAndAnswers.add(new Label(" "));
        exercisesAndAnswers.add(writeAnswerTextBox);

        setLayout(new BorderLayout());  // "super" Frame sets to BorderLayout
        add(topMenu, BorderLayout.NORTH);
        add(exercisesAndAnswers, BorderLayout.CENTER);

		addWindowListener(this);

		setTitle("Trainer");
		setSize(1000,600);
		setVisible(true);

	}
	//Activates normal quit (X-button):
	@Override
	public void windowClosing(WindowEvent evt) {
		System.exit(0);
	}
	//Shitty "implements WindowListener" needs all overrides...
	@Override public void windowOpened(WindowEvent evt) {}
	@Override public void windowClosed(WindowEvent evt) {}
	@Override public void windowIconified(WindowEvent evt) {}
	@Override public void windowDeiconified(WindowEvent evt) {}
	@Override public void windowActivated(WindowEvent evt) {}
	@Override public void windowDeactivated(WindowEvent evt) {}

    //Button actionhandler
    @Override
    public void actionPerformed(ActionEvent evt) {
        windowTypeButton=1;
    }

    public void printExerciseToGui(exercise someExercise) {
        showExercise.setText(someExercise.getTaskText());
    }

}
