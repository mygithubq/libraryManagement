import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
public class DeleteBook extends JFrame implements ActionListener  
{   MainWindow mw=new MainWindow();
	DataBaseManger db=new DataBaseManger();
	ResultSet rs;
	JLabel bno=new JLabel("<html><font color=#000000 size='4'>������Ҫɾ����ͼ�������ţ�</font>",SwingConstants.CENTER);
	JLabel L;
	JTextField tno=new JTextField(10);
	JTable table;
	JButton delbt=new JButton("ɾ��");
	JButton yesbt=new JButton("ȷ��");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	public DeleteBook()
	{   super("ɾ��ͼ��");
		Container c=getContentPane();	
		p1.add(bno);
		p1.add(tno);		
		c.add(p1,BorderLayout.NORTH);
		p2.add(delbt);	
		p2.add(yesbt);
		c.add(p2,BorderLayout.SOUTH);
		delbt.addActionListener(this);
		yesbt.addActionListener(this);
		setSize(400,300);
		setLocation(400,150);
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout());	}
	public void actionPerformed(ActionEvent e)
	{   String bno;		
	   if(e.getActionCommand()=="ȷ��")
			this.dispose();
		if(e.getActionCommand()=="ɾ��")
		{   bno=tno.getText();			
			String sqlstr="delete bno from book where bno='"+bno+"'";
	        boolean result=db.updateSql(sqlstr);
	        db.closeConnection();
	        if(result)
	        {JOptionPane.showMessageDialog(null,"ɾ���鼮�ɹ�!");}
	        else
	        {JOptionPane.showMessageDialog(null,"ɾ���鼮ʧ��!");
	        }}}}