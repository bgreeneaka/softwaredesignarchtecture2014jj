package Observer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	
	private TextData txtData;
	private OpenFile fileView;
	
	public Controller(TextData txtData) {
		// Constructor
		//this.fileView = fileView;
		this.txtData = txtData;
		this.txtData.addUpdateListner(new UpdateListner());
	}

	public class UpdateListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			txtData.editText(" HAS NOW BEEN UPDATED");
			//txtData.notifyAll();
			//fileView.update(txtData.getString());
		}

	}
}
