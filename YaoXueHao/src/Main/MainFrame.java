package Main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static boolean jrb1b = false;
	protected static boolean jrb2b = false;
	public MainFrame(){
		this.setVisible(true);
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension d=tk.getScreenSize();
		this.setSize(d.width/2,d.height/2);
		this.setLocation(d.width/4, d.height/4);
		this.setTitle("Powered by Olaf");
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});	
		JPanel jp=new JPanel();
		JRadioButton jrb1=new JRadioButton("aa");
		JRadioButton jrb2=new JRadioButton("bb");
		jp.add(jrb1);
		jp.add(jrb2);
		ButtonGroup g=new ButtonGroup();
		g.add(jrb1);
		g.add(jrb2);
		jrb1.addActionListener(new ButtonListener1());
		jrb2.addActionListener(new ButonListener2());
		this.add(jp);
		JLabel jlb1=new JLabel("jrb1 : "+MainFrame.jrb1b);
		JLabel jlb2=new JLabel("jrb2 : "+MainFrame.jrb2b);
		jp.add(jlb1);
		jp.add(jlb2);
		}
}
