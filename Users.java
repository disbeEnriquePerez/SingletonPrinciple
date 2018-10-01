public class Users {

		String name;
		ChatRoom Room; 
		public Users(String name) {
			
			Room = ChatRoom.getInstance(this);
			this.name = name;
		}
		public String getName()
		{
			return name;
		}
		
		public void Write (String line) {
			Room.write(this, line);
		}
	}
