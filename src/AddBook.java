import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
public class AddBook extends JFrame implements ActionListener  
{  MainWindow mw=new MainWindow();
	DataBaseManger db=new DataBaseManger();
	ResultSet rs;
	JPanel a,b,c,d,e,f;
    JLabel bname=new JLabel();
	JLabel bno=new JLabel();
	JLabel bnum=new JLabel();
	JLabel author=new JLabel();
	JLabel publisher=new JLabel();
	JTextField tname=new JTextField(20);
	JTextField tno=new JTextField(20);
	JTextField tnum=new JTextField(20);
	JTextField tauthor=new JTextField(20);
	JTextField tpublisher=new JTextField(20);
	JButton addbt=new JButton("���");
    JButton yesbt=new JButton("ȷ��");
	JPanel p3=new JPanel();
   public AddBook()
	{
	super("���ͼ��");
        a=new JPanel();		
		b=new JPanel();	
		c=new JPanel();		
		d=new JPanel();
		e=new JPanel();
		f=new JPanel();
                bname.setText("����  ��");
                bname.setFont(new Font("Dialog",0,12));
                bno.setText(" �����  ��");
                bno.setFont(new Font("Dialog",0,12));
                bnum.setText("������");
                bnum.setFont(new Font("Dialog",0,12));
                author.setText("���ߣ�");
                author.setFont(new Font("Dialog",0,12));
                publisher.setText(" ������  ��");
                publisher.setFont(new Font("Dialog",0,12));
        a.add(bname);
                a.add(tname);	
		b.add(bno);
                b.add(tno);		
		c.add(bnum);	
                c.add(tnum);	
		d.add(author);
                d.add(tauthor);
		e.add(publisher);
                e.add(tpublisher);	
		f.add(addbt);
                f.add(yesbt);	
		    	add(a);
                add(b);
                add(c);
                add(d);
                add(e);
                add(f);
		setLayout(new GridLayout(8,1));	
		addbt.addActionListener(this);
		yesbt.addActionListener(this);
		setSize(500,300);
		setLocation(400,150);
	}
	public void actionPerformed(ActionEvent e)
	{
		String bname,bno,author,publisher;
		int bnum;
		if(e.getActionCommand()=="ȷ��")
			this.dispose();
		if(e.getActionCommand()=="���")
		{
			bname=tname.getText();
			bno=tno.getText();
			author=tauthor.getText();
			publisher=tpublisher.getText();
			bnum=Integer.parseInt(tnum.getText());
			String sqlstr1="select bno from book";
			rs=db.getResult(sqlstr1);			
			try{
				while(rs.next())
				{
					if(rs.getString(1).trim().equals(bno))
					{
						JOptionPane.showMessageDialog(null,"������Ѵ��ڣ����������������!");
					}
					else
					{break;}
				}
			}
			catch(Exception pe) 
			{ 
            	pe.printStackTrace();       		 
			} 
			String sqlstr="insert into book (bno,bname,bnum,author,publisher) values ('"+bno+"','"+bname+"','"+bnum+"','"+author+"','"+publisher+"')";
	        boolean result=db.updateSql(sqlstr);
	        db.closeConnection();
	        if(result)
	        {
	        	JOptionPane.showMessageDialog(null,"����鼮�ɹ�!");
	        }
	        else
	        {
	        	JOptionPane.showMessageDialog(null,"����鼮ʧ��!");
	        }}}}