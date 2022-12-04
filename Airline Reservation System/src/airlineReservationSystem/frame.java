package airlineReservationSystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frame extends JFrame{
	JButton b,b1,b3,b4;
	JFrame f,f1;
	String s,s1;
frame()
{
	JFrame f=new JFrame();
	b=new JButton("RESERVATION OF FLIGHT");
	b.setBounds(150,100,200,50);
   
	b1=new JButton("AVAILABLE OF FLIGHTS");
	b1.setBounds(150,200,200,50);
	b1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if(e.getSource()==b1) {
    			f.dispose();
    			String city[]= {"CHENNAI","MADURAI","THOOTHUKUDI"};
    			JComboBox cb=new JComboBox(city);
      			JComboBox cb1=new JComboBox(city);
      			JLabel lab=new JLabel("DEPATURE");
      			JLabel lab1=new JLabel("DESTINATION");
      			lab.setBounds(100,50,100,50);
      			lab1.setBounds(300,50,100,50);
      			cb.setBounds(100,100,100,50);  
      			cb1.setBounds(300,100,100,50);		
      			b4=new JButton("CHECK");
      			b4.setBounds(300,300,100,50);
      			b4.addActionListener(new ActionListener() {
      		    	public void actionPerformed(ActionEvent e) {
      		    		s=(String)cb.getSelectedItem();
      					s1=(String)cb1.getSelectedItem();
      					if(s1==s)
      					{
      						JOptionPane.showMessageDialog(null,"INVALID");
      					}
      					else if(s=="CHENNAI")
      					{
      						switch(s1)
      						{
      						case "MADURAI":
      							JOptionPane.showMessageDialog(null,"4 FLIGHTS ARE AVAIALABLE\nINDIGO AIRLINE 14:00 PM->15:00 PM\nINDIGO AIRLINE ");
      							break;
      						case "THOOTHUKUDI":
      							JOptionPane.showMessageDialog(null,"2 FLIGHTS ARE AVIALABLE\nDECCAN AIRLINES 6:00 AM->7:30 AM\n  AIR AISA 16:30 PM->18:00 PM");
      							break;
          					}
          					}
      					else if(s=="MADURAI")
      					{
      						switch(s1)
      						{
      						case "CHENNAI":
      							JOptionPane.showMessageDialog(null,"1 FLIGHT IS AVAIALABLE\nINDIGO AIRLINE 14:00 PM->15:00 PM");
      							break;
      						case "THOOTHUKUDI":
      							JOptionPane.showMessageDialog(null," AIRLINES 6:00 AM\n BOING 729 AIR AISA 16:30 PM");
      							break;
          					}
      					}
      					else if(s=="THOOTHUKUDI")
      					{
      						switch(s1)
      						{
      						case "CHENNAI":
      							JOptionPane.showMessageDialog(null,"SORRY NO FLIGHTS ARE NOT AVIALABLE");
      							break;
      						case "MADURAI":
      							JOptionPane.showMessageDialog(null,"BOING 666 DECCAN AIRLINES 6:00 AM\n BOING 729 AIR AISA 16:30 PM");
      							break;
          					}
      					}
      		    	}
      					
      			});
    			JFrame f2=new JFrame("AIRLINE RESERVATION");
    			f2.setSize(500,500);
    			f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			f2.setLocationRelativeTo(null);
    			f2.getContentPane().setBackground(new Color(123,50,250));
    			f2.setLayout(null);
    			f2.setVisible(true);
    			f2.add(cb);
      			f2.add(cb1);
    		    f2.add(b4);
    		    f2.add(lab);
    		    f2.add(lab1);
    		}
    		}
    	});
	f.setTitle("Airline reservation");
	f.setSize(500,500);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.getContentPane().setBackground(new Color(123,50,250));
	f.add(b);
	f.add(b1);
	f.setLayout(null);
	f.setVisible(true);
	 b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(e.getSource()==b) {
	    			f.dispose();
	    		  new login();
	    		}
	    	}
	    	});
	
}
}

