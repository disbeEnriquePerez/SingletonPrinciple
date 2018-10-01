
import javax.swing.*;

public class ChatRoom extends JFrame {

	private static ChatRoom obj;
	
	JTextArea field; 
	
	private ChatRoom(Users user) {

		this.setSize(500,500);
		
		this.setTitle("Chat Room" );
		
		this.setResizable(false);
		
		buildpannel();
		
		this.setVisible(true);
	
	} 
	
	//Singleton Principle
	public static ChatRoom getInstance(Users user)
	{
		if(obj == null)
		{
			synchronized(ChatRoom.class)
			{
				if(obj == null)
				{
					obj = new ChatRoom(user);
					
				}
			}
		}
		
		return obj;
	}
	
	public void write(Users user, String line) {
		String line2 = field.getText();
			field.setText(line2 + user.getName() + ": " + line + "\n");
	}

	
	private void buildpannel()
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
