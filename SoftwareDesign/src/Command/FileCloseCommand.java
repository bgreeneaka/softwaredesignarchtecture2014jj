package Command;

import javax.swing.JMenuItem;


public class FileCloseCommand extends JMenuItem implements Command {
	
	public FileCloseCommand (String caption){
		super(caption);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
