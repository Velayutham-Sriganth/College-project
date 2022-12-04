package airlineReservationSystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login extends JFrame{
	login(){
	JFrame f1=new JFrame("Airline Resevation-LOG IN");
	f1.setSize(500,500);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f1.setLocationRelativeTo(null);
	f1.getContentPane().setBackground(new Color(123,50,250));
	JLabel l=new JLabel();
	l.setText("USER NAME");
	l.setBounds(50,30,100,200);
	JTextField tf=new JTextField();
	tf.setBounds(150,100,200,50);
	JLabel l1=new JLabel();
	l1.setText("PASSWORD");
	l1.setBounds(50,130,100,200);
	JPasswordField  tf1=new JPasswordField ();
	tf1.setBounds(150,200,200,50);
	JButton b3=new JButton("OK");
	b3.setBounds(300,300,100,50);
	b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			String s1 = tf.getText();
	        String s2 = tf1.getText();   
	        if(s1.equals("vela2614") && s2.equals("123"))
	        {
	         f1.dispose();
	         JFrame jf=new JFrame("AIRLINE RESERVATION");
	         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       	
	     	 jf.getContentPane().setBackground(new Color(123,50,250));
	         String city[]= {"CHENNAI","MADURAI","THOOTHUKUDI"};
 			JComboBox combo=new JComboBox(city);
   			JComboBox combo1=new JComboBox(city);
   			JLabel label=new JLabel("DEPATURE");
   			JLabel label1=new JLabel("DESTINATION");
   			label.setBounds(100,50,100,50);
   			label1.setBounds(300,50,100,50);
   			combo.setBounds(100,100,100,50);  
   			combo1.setBounds(300,100,100,50);		
   			JButton but4=new JButton("FIND");
   			but4.setBounds(300,300,100,50);
   			but4.addActionListener(new ActionListener() {
   		    	public void actionPerformed(ActionEvent e) {
   		    		jf.dispose();
   		    		JFrame frame=new JFrame("AIRLINE RESERVATION");
   		    		frame.setSize(500,500);
   		    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   		    		frame.setLocationRelativeTo(null);
   		    		frame.getContentPane().setBackground(new Color(123,50,250));
   		    		String str=(String)combo.getSelectedItem();
   					String str1=(String)combo1.getSelectedItem();
 
   		         if(str1==str)
					{
						JOptionPane.showMessageDialog(null,"INVALID");
					}
   		         else
   		         {
   		        	frame.setLayout(null);
   		            frame.setLocationRelativeTo(null);
   		            frame.setVisible(true);
   		         }
   		      
   					if(str=="CHENNAI")
   					{
   						switch(str1)
   						{
   						case "MADURAI":
   							//JOptionPane.showMessageDialog(null,"4 FLIGHTS ARE AVAIALABLE\nINDIGO AIRLINE 14:00 PM->15:00 PM\nINDIGO AIRLINE ");
   							JComboBox box=new JComboBox();
   			   		      box.setBounds(100,100,300,50);
   			   		      frame.add(box);
   			   					
   						    
   							break;
   						case "THOOTHUKUDI":
   							JComboBox box1=new JComboBox();
     			   		      box1.setBounds(100,100,300,50);
     			   		      frame.add(box1);
     			   					
   							//JOptionPane.showMessageDialog(null,"2 FLIGHTS ARE AVIALABLE\nDECCAN AIRLINES 6:00 AM->7:30 AM\n  AIR AISA 16:30 PM->18:00 PM");
   							break;
       					}
       					}
   					else if(str=="MADURAI")
   					{
   						switch(str1)
   						{
   						case "CHENNAI":
   							JComboBox box2=new JComboBox();
     			   		      box2.setBounds(100,100,300,50);
     			   		      frame.add(box2);
     			   					
   							//JOptionPane.showMessageDialog(null,"1 FLIGHT IS AVAIALABLE\nINDIGO AIRLINE 14:00 PM->15:00 PM");
   							break;
   						case "THOOTHUKUDI":
   							String cty[]= {"INDIGO AIRLINE 14:00 PM->15:00 PM","BOING 729 AIR AISA 16:30 PM"};
   							JComboBox box3=new JComboBox(cty);
			   		        box3.setBounds(100,100,300,50);
   							JButton x=new JButton("BOOK");
   							x.setBounds(300,300,100,50);
   							String place=(String)box3.getSelectedItem();
   							x.addActionListener(new ActionListener() {
   				   		    	public void actionPerformed(ActionEvent e) {
     			   		       if(place=="INDIGO AIRLINE 14:00 PM->15:00 PM")
     			   		       {
     			   		    	   frame.dispose();
     			   		    	   JFrame bt=new JFrame("AIRLINE RESERVATION");
     			                   
     			   		    	   bt.setSize(500,500);
     			   		           bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     			   		    	   bt.setLocationRelativeTo(null);
     			   		    	   bt.getContentPane().setBackground(new Color(123,50,250));
     			   		    	   JTextField t1=new JTextField("YOU SELECTED INDIGO AIRLINE 14:00 PM->15:00 PM ");
     			   		    	   t1.setBounds(100,50,400,50);
     			   		    	   JLabel ko=new JLabel("ENTER REQUIRED NO TICKET");     			   		    	   
     			   		    	   ko.setBounds(100,20,100,100);
     			   		    	   bt.setLayout(null);
     			   		    	   bt.setLocationRelativeTo(null);
     			   		    	   bt.setVisible(true);
     			   		    	   bt.add(t1);
     			   		       }
     			   		   if(place=="BOING 729 AIR AISA 16:30 PM")
 			   		       {
 			   		    	   frame.dispose();
 			   		    	   JFrame bt=new JFrame("AIRLINE RESERVATION");
 			                   
 			   		    	   bt.setSize(500,500);
 			   		           bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 			   		    	   bt.setLocationRelativeTo(null);
 			   		    	   bt.getContentPane().setBackground(new Color(123,50,250));
 			   		    	   JTextField t1=new JTextField("YOU SELECTED INDIGO AIRLINE 14:00 PM->15:00 PM ");
 			   		    	   t1.setBounds(100,50,400,50);
 			   		    	   JLabel ko=new JLabel("ENTER REQUIRED NO TICKET");     			   		    	   
 			   		    	   ko.setBounds(100,20,100,100);
 			   		    	   bt.setLayout(null);
 			   		    	   bt.setLocationRelativeTo(null);
 			   		    	   bt.setVisible(true);
 			   		    	   bt.add(t1);
 			   		       }
     			   		        
   				   		    	}
   							});
   							//JOptionPane.showMessageDialog(null," AIRLINES 6:00 AM\n BOING 729 AIR AISA 16:30 PM");
   							frame.add(box3);
 			   		        frame.add(x);
 			   		      
   							break;
       					}
   					}
   						
   					else if(str=="THOOTHUKUDI")
   					{
   						switch(str1)
   						{
   						case "CHENNAI":
   							JComboBox box4=new JComboBox();
     			   		      box4.setBounds(100,100,300,50);
     			   		      frame.add(box4);
     			   					
   							//JOptionPane.showMessageDialog(null,"SORRY NO FLIGHTS ARE NOT AVIALABLE");
   							break;
   						case "MADURAI":
   							JComboBox box5=new JComboBox();
     			   		      box5.setBounds(100,100,300,50);
     			   		      frame.add(box5);
     			   					
   							//JOptionPane.showMessageDialog(null,"BOING 666 DECCAN AIRLINES 6:00 AM\n BOING 729 AIR AISA 16:30 PM");
   							break;
       					}
   					}
   		    	}
   					
   			});
	         jf.setSize(500,500);
	         jf.add(combo1);
	         jf.add(combo);
	         jf.add(but4);
	         jf.add(label);
	         jf.add(label1); 
	         jf.setLayout(null);
	         jf.setLocationRelativeTo(null);
	         jf.setVisible(true);
	         
	        
	        }
	        else
	        {
	        	JOptionPane.showMessageDialog(null,"INVALID");
	        }
	       
		}
	});
	f1.add(b3);
    f1.add(tf);
	f1.add(l);
	f1.add(l1);
	f1.add(tf1);
	f1.setLayout(null);
	f1.setVisible(true);
}
}

