package fr.thomas.main;

 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;  



public class RequestGoogle implements ActionListener{
	
	private JFrame myWindow;
	private JPanel panel;
	private JTextField URLTextField;
	
	
	private JLabel labelProtocol;
	private JLabel labelHostName;
	private JLabel labelPort;
	private JLabel labelFileName;
	
	
	public RequestGoogle() {
		
		// this is my constructer of my object
		
		myWindow = new JFrame();// First : I create my main window
		myWindow.setTitle("Week 9 - Homework");
		myWindow.setSize(600,300);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		panel = new JPanel(); // Second : I create a part of my window. In this element, I will add label and button
		myWindow.add(panel);// Thrid : I add my panel on my graphical window
		panel.setLayout(null);
		
		
		JLabel labelURL = new JLabel("URL => ");
		labelURL.setBounds(10,20,80,25);
		panel.add(labelURL);
		
		
		URLTextField = new JTextField("http://challenge01.root-me.org/programmation/ch1/");
		URLTextField.setBounds(90,20,400,25);
		panel.add(URLTextField);
		
		
		JButton myButton = new JButton("Request");
		myButton.addActionListener(this);
		myButton.setBounds(490,20,100,20);
		panel.add(myButton);
		
		
		labelProtocol = new JLabel("Protocol => ");
		labelProtocol.setBounds(50,50,400,25);
		panel.add(labelProtocol);
		
		
		labelHostName = new JLabel("Host Name => ");
		labelHostName.setBounds(50,75,400,25);
		panel.add(labelHostName);
		
		
		labelPort = new JLabel("Port Number => ");
		labelPort.setBounds(50,100,400,25);
		panel.add(labelPort);
		
		
		labelFileName = new JLabel("File Name => ");
		labelFileName.setBounds(50,125,400,25);
		panel.add(labelFileName);

		

		myWindow.setVisible(true);// I print my window
	}

	
	public static void main(String[] args){

		new RequestGoogle();// I am calling the creator of my object

	  }


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		URL url;
		
		try {
			
			String urlTarget = URLTextField.getText();
			
			url = new URL(urlTarget);
			
			labelProtocol.setText("Protocol => "+ url.getProtocol());
			labelHostName.setText("Host Name => "+ url.getHost());
			labelPort.setText("Port Number => "+ url.getPort());
			labelFileName.setText("File Name => "+ url.getFile());

	        
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}  
	}
	
}


