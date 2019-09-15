package new1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySwingWindow extends JFrame {
    //�˴�ͨ���̳�JFrame����ʹ�����Լ���MySwingWindow���д����һЩ���Ժͷ���
	private JLabel myLabel;
	private JLabel getJLabel() {
	    //�˴��ķ���ֵ����ΪJLabel

	    if(myLabel == null) {

	        myLabel = new JLabel();
	        //ʵ����myLabel����

	        myLabel.setBounds(5, 10, 250, 30);
	        //ʹ��setBounds()�������óߴ�
	        //�ĸ������ķֱ���x,y,width,height
	        //�����˺��������λ�ã��Լ���ǩ����Ŀ�͸�

	        myLabel.setText("Hello! Welcome to java swing");
	        //ʹ��setText()��������Ҫ��ʾ���ı�
	    }

	    return myLabel;
	    //���ش�����ʵ��
	}
	
    public MySwingWindow(){
        //�ڴ���Ĺ��췽�������ô���ĸ�������

        super();
        //ʹ�� super() �����ø���ĳɷ֣��� this �����õ�ǰ����

        this.setSize(924, 700);
        //���ô���Ĵ�С

        this.getContentPane().setLayout(null);
        //���ش˴���� contentPane ���������䲼��
        //��һ�䲻̫���Ļ�Ҳ���õ��ģ���д��

        this.setTitle("������1��swing ");
        //���ô���ı���
        
        this.add(getJLabel(),null);
        this.add(getJTextField(), null);
        this.add(getJButton(),null);
    }
    
    
    private JTextField myTextField;

    private JTextField getJTextField() {
        //�˴��ķ���ֵ����ΪJTextField

        if(myTextField == null) {
        //��������ж���Ϊ�˷�ֹ����

            myTextField = new JTextField();
            //ʵ����myTextField����

            myTextField.setBounds(5, 45, 200, 30);
            //��������λ�úͳߴ�

            myTextField.setText("��Ҫ���㣡����������������������������������");
            //�趨��Ҫ��ʾ���ַ���

        }

        return myTextField;
        //�������ʵ��
    }
    
    private JButton myButton;

    private JButton getJButton() {
        //�˴��ķ���ֵ����ΪJButton 

        if(myButton == null) {

            myButton = new JButton();
            //ʵ����myTextField����
            myButton.setBounds(5, 80, 100, 40);
            //��������λ�úͳߴ�
            myButton.setText("�����!");
            //�趨��Ҫ��ʾ���ַ���
            myButton.addActionListener(new ActionListener() {
                //Ϊ�����һ���¼��������Ӷ�ʹ�����ť������Ӧ�û��ĵ������
                //ActionListener�����ڽ��ղ����¼����������ӿڡ�
                //�Դ�������¼�����Ȥ�������ʵ�ִ˽ӿڣ���ʹ�ø��ഴ���Ķ�
                //��ʹ������� addActionListener ����������ע�ᡣ
                //�ڷ��������¼�ʱ�����øö���� actionPerformed ������

                public void actionPerformed(ActionEvent e) {
                    //�÷������ڷ�������ʱ�����ã�����Ҫ��������Ϳ���д��������
                    //������������Ҫ����������Ǹı�֮ǰ�����ؼ������������ɫ�ͱ���ɫ

                    myLabel.setForeground(Color.GREEN);
                    //���ô������ǰ��ɫ��

                    myTextField.setBackground(Color.YELLOW);
                    //���ô�����ı���ɫ��
                }
            });
        }

        return myButton;
        //�������ʵ��
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MySwingWindow window = new MySwingWindow();
        //����һ��������� window

        window.setVisible(true);
        //������������ǿɼ���
    }
}