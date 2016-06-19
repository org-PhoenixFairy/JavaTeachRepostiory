package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		MainFrame.jrb2b = true;
		MainFrame.jrb1b = false;
		
	}

}
