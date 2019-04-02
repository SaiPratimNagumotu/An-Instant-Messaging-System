/*
 * Instant Messaging Application.
 * Name: Sai Pratim Nagumotu
 * ID: 1001552436
 * 
 * ClientServer class for choosing server or client
 */

import javax.swing.*;


//class to precise who is connected client or server
public class RoleSelection {

	public static void main(String[] args) {
		
		/* Object interface to implement array of initial values to select for "server"
		 * or "client" role
		 */
		Object[] selectionValues = { "Server","Client"};
		// Initial value to show in input prompt
		String selectedRole = "Server";
		
		//JOptionpane for prompting user to select the role 
		Object selection = JOptionPane.showInputDialog(null, "Login as : ", "MyChatApp", JOptionPane.QUESTION_MESSAGE, null, selectionValues, selectedRole);
		
		/*
		 * If server is selected from the input prompt, MultiThreadClients class
		 * is run for running the server setting up sockets, and 
		 * assigning a thread for each connection.
		 */
		
		if(selection.equals("Server")){
                   String[] arguments = new String[] {};
			new MultiThreadClients().main(arguments);
			/*
			 * If client is selected from the input prompt, chatclient class
			 * is run for setting up the GUI, and a thread for displaying messages in  
			 * the chat access area.
			 */
			
		}else if(selection.equals("Client")){
			String IPServer = JOptionPane.showInputDialog("Enter the Server ip adress");
                        String[] arguments = new String[] {IPServer};
			new ChatClient().main(arguments);
		}

	}

}
