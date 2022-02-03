package administracao;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class paginaPrincipal extends JFrame {
	
	private JButton plainButton;
	private JButton fancyButton;
	
	public ButtonFrame(){	
		
		super(" Testing Buttons ");
		setLayout(new FlowLayout() );
		
		plainJButton = new JButton(" Plain Button ");
		add( plainJButton );
		
		Icon bug1 = new ImageIcon( getClass() .getResource("bu1.gif") );
		Icon bug2 = new ImageIcon( getClass() .getResource("bu2.gif") );
		fancyButton = new JButton("Fancy Btton" , bug1);
		fancyButton.setRolloverIcon(bug2);
		add( fancyButton );
		
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener( handler );
		plainJButton.addAvtionListener( handler );
		}
	private class ButtonHandler implements ActionListener{
		
		public void actionPerformed( ActionEvent event ) {
			JOptionPane.showMessageDialog(ButtonFrame.this.String.format(
				"You pressed: %s", event.getActionCommand()	) );
		}
	}
}
