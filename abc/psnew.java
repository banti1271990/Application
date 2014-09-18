import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.File;

public class psnew extends JFrame implements ActionListener,ItemListener
{
	
	JLabel l1,lid,lnam,lfnam,ldob,ldoj,ladd,lcity,lstate,lpin,lcon,ldes,ldep,lgen,li;
	JTextField tid,tnam,tfnam,tdob,tdoj,tcity,tpin,tcon,tdes,tdep,tadd,tgen;
	JRadioButton r1,r2;
	JComboBox jc;
	JButton b1,b2,b3;
	Container c;
	JPanel p1,p2,p3,p4,p5,p6;
	String v,g,s0;
	ButtonGroup bg;
	final JFileChooser fc=new JFileChooser();

	public psnew()
	{
		
		l1=new JLabel("New Employee Entry");
		l1.setFont(new Font("SansSerif",Font.BOLD,15));
		lid=new JLabel("Eid");
		lnam=new JLabel("Name");
		lfnam=new JLabel("Father Name");
		ldob=new JLabel("DOB");
		ladd=new JLabel("Address");
		lcity=new JLabel("City");
		lstate=new JLabel("State");
		lpin=new JLabel("Pincode");
		lcon=new JLabel("Contact no");
		ldes=new JLabel("Designation");
		ldep=new JLabel("Department");
		ldoj=new JLabel("DOJ");	
		lgen=new JLabel("Gender");
		li=new JLabel();


		tid=new JTextField(10);
		tnam=new JTextField(10);
		tfnam=new JTextField(10);
		tdob=new JTextField(10);
		tcity=new JTextField(10);
		tdoj=new JTextField(10);
		tpin=new JTextField(10);
		tcon=new JTextField(10);
		tdes=new JTextField(10);
		tdep=new JTextField(10);
		tadd=new JTextField(10);
		tgen=new JTextField(10);

		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");

		r1.setBackground(Color.PINK);
		r2.setBackground(Color.PINK);		

		jc=new JComboBox();
		jc.addItem("-Select-");
		jc.addItem("Jammu");
		jc.addItem("Haryana");
		jc.addItem("Delhi");
		jc.addItem("Rajasthan");
		jc.addItem("Gujarat");
		jc.addItem("Uttar-Pradesh");

		b1=new JButton("Save");
		b2=new JButton("Cancel");
		b3=new JButton("Browse");
		


		p1=new JPanel(new GridLayout(1,1));
		p6=new JPanel(new FlowLayout());
		p2=new JPanel(new GridLayout(3,2));
		p3=new JPanel(new GridLayout(1,3));
		p4=new JPanel(new GridLayout(9,2));
		p5=new JPanel(new GridLayout(1,3));
		
		p1.setBounds(180,20,150,50);
		p2.setBounds(30,100,200,50);
		p3.setBounds(30,170,200,50);
		p4.setBounds(30,240,200,200);
		p5.setBounds(50,460,300,30);
		p6.setBounds(250,100,200,200);
		

		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);

		c.add(p1);		
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		c.add(p6);

		p1.add(l1);
		p6.add(li);
		p2.add(lid);
		p2.add(tid);
		p2.add(lnam);
		p2.add(tnam);
		p2.add(lfnam);
		p2.add(tfnam);
		p3.add(lgen);
		p3.add(r1);
		p3.add(r2);
		p4.add(ldob);
		p4.add(tdob);
		p4.add(ladd);
		p4.add(tadd);
		p4.add(lcity);
		p4.add(tcity);
		p4.add(lstate);
		p4.add(jc);
		p4.add(lpin);
		p4.add(tpin);
		p4.add(lcon);
		p4.add(tcon);
		p4.add(ldes);
		p4.add(tdes);
		p4.add(ldep);
		p4.add(tdep);
		p4.add(ldoj);
		p4.add(tdoj);
		p5.add(b1);
		p5.add(b2);
		p5.add(b3);
	
		bg= new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		jc.addItemListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		r1.addActionListener(this);
		r2.addActionListener(this);

		p1.setBackground(Color.PINK);
		p2.setBackground(Color.PINK);
		p3.setBackground(Color.PINK);
		p4.setBackground(Color.PINK);
		p5.setBackground(Color.PINK);
		p6.setBackground(Color.PINK);

		l1.setForeground(Color.BLUE);
		

		
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
	
	
	}	
			public void itemStateChanged(ItemEvent ie)
			{
				g=(String)ie.getItem();
			}
			
		
			public void actionPerformed(ActionEvent ae)
			{

				if(ae.getSource()==r1||ae.getSource()==r2)
				 v=ae.getActionCommand();
				if(ae.getSource()==b1)
				{
					Connection con= null;
					Statement s=null;
					try
					{
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						con=DriverManager.getConnection("jdbc:odbc:veena");
						s=con.createStatement();
						int id=Integer.parseInt(tid.getText());  
           
						String s1=tnam.getText();
						String s2=tfnam.getText();
						String s3=tadd.getText();
						String s4=tcity.getText();
						String s6=tdes.getText();
						String s7=tdep.getText();
						String s8=tdob.getText();
						String s9=tdoj.getText();
						String s10=tpin.getText();
						String s11=tcon.getText();
				

				
						s.executeUpdate("Insert into emp values("+id+",'"+s1+"','"+s2+"','"+v+"','"+s8+"','"+s3+"','"+s4+"','"+g+"','"+s10+"','"+s11+"','"+s6+"','"+s9+"','"+s7+"','"+s0+"')");
						JOptionPane.showMessageDialog(null,"Data inserted");
						
						tid.setText(null);
						tnam.setText(null);
						tfnam.setText(null);
						tdob.setText(null);
						tdoj.setText(null);
						tcity.setText(null);
						tpin.setText(null);
						tcon.setText(null);
						tdes.setText(null);
						tdep.setText(null);
						tadd.setText(null);
						li.setIcon(null);
						

						con.close();
						s.close();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}



				else if(ae.getSource()==b2)
				{
						
					System.exit(0);
				
				}
				
				else if(ae.getSource()==b3)
				{
					int d=fc.showOpenDialog(null);
					if(d==JFileChooser.APPROVE_OPTION)
					{
						File f1=fc.getSelectedFile();
						System.out.println(f1.getName());
						repaint();
						s0=f1.getAbsolutePath();
						li.setIcon(new ImageIcon(s0));
					}
				}
				
		
		 	}		
	
			public static void main(String args[])
			{
				psnew b = new psnew();
				b.setVisible(true);
				b.setSize(500,550);
				b.setLocation(400,100);
				//b.setResizable(false);
				b.setTitle("New Employee Entry");
			}	
}
