
import javax.swing.*;
public class ChatRoom extends JFrame {

	JTextArea field; 
	public ChatRoom()
	{
		this.setSize(500,500);
		
		
		
		this.setTitle("Chat Room" );
		
		this.setResizable(false);
		
		buildpannel();
		
		this.setVisible(true);

	}
	
	public void buildpannel()
	{
		JPanel panel= new JPanel();
		
		field = new JTextArea(20,20);
		
		panel.add(field);
		
		this.add(panel);
	}
	
	public void WriteTOfield(String write)
	{
		String line = field.getText(); 
		line += "\n" + write;
		field.setText(line);
	}
}
