import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JEditorPane;
import javax.swing.JTextArea;


public class ASCIIEditorListener implements KeyListener
{
	protected JEditorPane	m_modified;
	
	public ASCIIEditorListener(JEditorPane p_modified)
	{
		this.m_modified = p_modified;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		JTextArea	listened = ((JTextArea)(e.getSource()));
		this.m_modified.setText(listened.getText());
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) 	{}

	@Override
	public void keyReleased(KeyEvent arg0)	{}				
}
