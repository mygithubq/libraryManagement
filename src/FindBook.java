import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
public class FindBook extends JFrame implements ActionListener
{   DataBaseManger db=new DataBaseManger();
	ResultSet rs;
	JLabel select=new JLabel("�������������������");
	JTextField jtf=new JTextField(20);
	JPanel a=new JPanel();
	JPanel b=new JPanel();
	JLabel lb=new JLabel("�鼮��Ϣ");
	JButton findbt=new JButton("��ѯ");
	JButton yesbt=new JButton("ȷ��");
	JTextArea jta=new JTextArea(10,10);
	public FindBook()
	{   super("��ѯ�鼮��Ϣ");
		Container c=getContentPane();
		a.add(select);
		a.add(jtf);
		a.add(findbt);
		c.add(a,BorderLayout.NORTH);
		b.add(lb);
		b.add(jta);
		b.add(yesbt);
		c.add(b,BorderLayout.SOUTH);
		yesbt.addActionListener(this);
		findbt.addActionListener(this);
		setSize(500,300);
		setVisible(true);
		setLocation(400,150);
	}
	public void actionPerformed(ActionEvent e)
	{   if(e.getActionCommand()=="ȷ��")
			this.dispose();
		if(e.getActionCommand()=="��ѯ")
		{   String bname=jtf.getText();
			String bno=jtf.getText();
			String sqlstr;
			sqlstr="select * from book where bname='"+bname+"' or bno='"+bno+"'";
			rs=db.getResult(sqlstr);
			try
			{   jta.setText("");
				if(rs.next()){
		jta.append("�����Ϊ:"+rs.getString(1)+"\n");           
        jta.append("����Ϊ:"+rs.getString(2)+"\n");            
        jta.append("��������Ϊ:"+rs.getString(3)+"\n");            
        jta.append("������Ϊ:"+rs.getString(5)+"\n");
		jta.append("����Ϊ:"+rs.getString(4)+"\n");   }
				else
				{jta.append("�Բ���û����Ҫ�ҵ��鼮��"); } }
			catch(Exception pe) 
			{ pe.printStackTrace();        		 	
	} }}}