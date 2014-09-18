import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class eps extends JFrame
{
	JMenu emp,format,leave,report;
	JMenuItem enew,eup,del,exit,bs,in,bon,ded,ls,er,dr,pay,tsal;
	JMenuBar mb;
	Container c;
	
	public eps()
	{
		mb=new JMenuBar();
		setJMenuBar(mb);
		
		emp=new JMenu("Employee");
		format=new JMenu("Format");
		leave=new JMenu("Leave");
		report=new JMenu("Report");
		
		enew=new JMenuItem("New");
		eup=new JMenuItem("Update");
		del=new JMenuItem("Delete");
		exit=new JMenuItem("Exit");
		bs=new JMenuItem("Basic Salary");
		in=new JMenuItem("Incentives");
		ded=new JMenuItem("Deduction");
		bon=new JMenuItem("Bonus");
		ls=new JMenuItem("Leave Status");
		er=new JMenuItem("Emp Report");
		dr=new JMenuItem("Deduction Report");
		pay=new JMenuItem("Payslip");
		tsal=new JMenuItem("Total Salary");

		emp.add(enew);
		emp.add(eup);
		emp.add(del);
		emp.add(exit);
	
		format.add(bs);
		format.add(in);
		format.add(ded);
		format.add(bon);
		format.add(tsal);

		leave.add(ls);

		report.add(er);
		report.add(dr);
		report.add(pay);

		mb.add(emp);
		mb.add(format);
		mb.add(leave);
		mb.add(report);

		c=getContentPane();
		ImageIcon i1=new ImageIcon("D://veena/photos/sweet v/quotes/u.jpg");
		JLabel j1=new JLabel("eps",i1,JLabel.CENTER);
		c.add(j1);
		
		enew.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(enew))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,550);
					n.setLocation(400,100);
					n.setTitle("New Employee Entry");
				}
			}
		});
		
		eup.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(eup))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,550);
					n.setLocation(400,100);
					n.setTitle("Update Employee Data");
				}
			}
		});
		
		del.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(del))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,550);
					n.setLocation(400,100);
					n.setTitle("Delete Employee Record");
				}
			}
		});

		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(exit))
				{
					System.exit(0);
				}
			}
		});

		bs.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(bs))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,500);
					n.setLocation(400,100);
					n.setTitle("Basic Salary");
				}
			}
		});

		ded.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(ded))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,500);
					n.setLocation(400,100);
					n.setTitle("Deduction in salary");
				}
			}
		});

		bon.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(bon))
				{
					eps n=new eps ();
					n.setVisible(true);
					n.setSize(500,500);
					n.setLocation(400,100);
					n.setTitle("Bonus");
	 			
				}
			}
		});

		ls.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(ls))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,500);
					n.setLocation(400,100);
					n.setTitle("Leave Status");
				}
			}
		});
		
		in.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(in))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,500);
					n.setLocation(400,100);
					n.setTitle("Incentives");
				}
			}
		});

		tsal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(tsal))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,500);
					n.setLocation(400,100);
					n.setTitle("Total salary");
				}
			}
		});

		pay.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource().equals(pay))
				{
					eps n=new eps();
					n.setVisible(true);
					n.setSize(500,600);
					n.setLocation(400,100);
					n.setTitle("Payslip");
				}
			}
		});
	}		
		public static void main(String args[])
		{
			eps b = new eps();
			b.setVisible(true);
			b.setSize(500,500);
			b.setLocation(400,100);
			b.setTitle("Employee Payroll System");
		}
}
