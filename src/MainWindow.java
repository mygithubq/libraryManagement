import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JMenu;
public class MainWindow extends JFrame implements ActionListener
{   private static final long serialVersionUID = 1L;
	static String loginName;
	static String loginNo;
	JLabel mlabel;
	JPanel jp=new JPanel();      
 	//�����˵���
	JMenuBar menu=new JMenuBar();
    JMenu a=new JMenu();
	JMenu b=new JMenu();
	JMenu c=new JMenu();	
    //����ϵͳ����˵���
	JMenuItem aa=new JMenuItem();
	JMenuItem ab=new JMenuItem();
	JMenuItem ac=new JMenuItem();
    //�������߹���˵���
	JMenuItem bb=new JMenuItem();
	//�����鼮����˵���
	JMenuItem ca=new JMenuItem();
	JMenuItem cb=new JMenuItem();
	JMenuItem cc=new JMenuItem();
	JMenuItem cd=new JMenuItem();
public MainWindow(){
    super("ͼ�����ϵͳ");
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);}});
			Container d=getContentPane();
			this.setSize(300,200);
			this.setTitle("ͼ�����ϵͳ");
			d.add(menu);
			menu.add(a);
			menu.add(b);
			menu.add(c);
			//��Ӳ˵���
			a.setText("ϵͳ����");
			a.setFont(new Font("Dialog",0,12));
			b.setText("���߹���");
			b.setFont(new Font("Dialog",0,12));
			c.setText("�鼮����");
			c.setFont(new Font("Dialog",0,12));
			//����ϵͳ����˵����ѡ��
			aa.setText("��¼");
			aa.setFont(new Font("Dialog",0,12));
			ab.setText("�˳���¼");
			ab.setFont(new Font("Dialog",0,12));
			ac.setText("�˳�ϵͳ");
			ac.setFont(new Font("Dialog",0,12));
			//���ɶ��߹���˵����ѡ��
			bb.setText("��ѯ������Ϣ");
			bb.setFont(new Font("Dialog",0,12));
			//�����鼮����˵����ѡ��
			ca.setText("����鼮");
			ca.setFont(new Font("Dialog",0,12));
			cb.setText("ɾ���鼮");
			cb.setFont(new Font("Dialog",0,12));
			cc.setText("��ѯ������Ϣ");
			cc.setFont(new Font("Dialog",0,12));
			cd.setText("�����鼮");
			cd.setFont(new Font("Dialog",0,12));
			//���ϵͳ����˵���
			a.add(aa);
			a.add(ab);
			a.add(ac);
			//��Ӷ��߹���˵���
			b.add(bb);
			//����鼮����˵���
			c.add(ca);
			c.add(cb);
			c.add(cc);
			c.add(cd);
			//����¼�����
			aa.addActionListener(this);
			ab.addActionListener(this);
			ac.addActionListener(this);
			bb.addActionListener(this);
			ca.addActionListener(this);
			cb.addActionListener(this);
			cc.addActionListener(this);
			cd.addActionListener(this);
			setJMenuBar(menu);}
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==aa){

					UserLogin login=new UserLogin(this);
					login.setVisible(true);}
					if(e.getSource()==ab){

					setVisible(false);
					MainWindow mainFrame=new MainWindow();
					mainFrame.setLocation(400,150);
					mainFrame.setVisible(true);
						}
			if(e.getSource()==ac)
			{System.exit(0);}
			if(e.getSource()==cc)
			{FindBook findbook=new FindBook();
			findbook.setVisible(true);
			}
			if(e.getSource()==bb)
			{
			FindReader findreader=new FindReader();
			findreader.setVisible(true);
			}
			if(e.getSource()==ca)
			{
			AddBook addBook=new AddBook();
			addBook.setVisible(true);
			}
			if(e.getSource()==cb)
			{
			DeleteBook delBook=new DeleteBook();
			delBook.setVisible(true);
			}
			if(e.getSource()==cd)
			{
			UpdateBook updBook=new UpdateBook();
			updBook.setVisible(true);
			}}
			public void setenabled(int right)
			{if(right==1)
			{
			b.setEnabled(true);
			c.setEnabled(true);}
			if(right==2)
			{
			b.setEnabled(true);
			c.setEnabled(true);}
			}
			public static void main (String[] args){
				MainWindow mainFrame=new MainWindow();
				mainFrame.setLocation(400,200);
				mainFrame.setVisible(true);
			}
			}