import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.text.html.HTMLEditorKit;

public class Main 
{	
	public static void main(String[] args)
	{		
		JFrame	window = new JFrame();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setSize(800, 600);
			window.setTitle("HTML Editor");
			
		JTextArea	ASCIIPanel = new JTextArea();
			ASCIIPanel.setText("<html>\n" +
							   "  <head>\n" +
							   "    <title>Title</title>\n" +
							   "  </head>\n" +
							   " <body>\n" +
							   "   \n" +
							   " </body>\n" +
							   "</html>" +
							   "");
					
		JEditorPane	HTMLPanel = new JEditorPane();
			HTMLPanel.setEditorKit(new HTMLEditorKit());
			HTMLPanel.setEditable(false);
			HTMLPanel.setText(ASCIIPanel.getText());
			
		ASCIIPanel.addKeyListener(new ASCIIEditorListener(HTMLPanel));
			
		JSplitPane	MainPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, ASCIIPanel, HTMLPanel);
			MainPanel.setOneTouchExpandable(true);
			MainPanel.setDividerSize(20);
			window.getContentPane().add(MainPanel, BorderLayout.CENTER);
			MainPanel.setResizeWeight(0.5d);
			MainPanel.setDividerLocation(400);
		
			
		window.setVisible(true);
	}
}
