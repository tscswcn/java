package new1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
import java.math.BigDecimal;

public class Calculator {

    // ������1��Ϊ�˳���İ�ȫ����ֵһ�����ã�������������Ϊ0��
	String str1 = "0"; 
	
	// ������2
	String str2 = "0"; 
	
	// �����
	String signal = "+"; 
	
	// ������
	String result = "";

	// ����k1��k2Ϊ״̬����
	
	// ����1����ѡ�����뷽�򣬽�Ҫд��str1��str2
	int k1 = 1;
	// ����2���ڼ�¼���ż��Ĵ�������� k2>1 ˵�����е��� 2+3-9+8 �����Ķ��������
	int k2 = 1;
	// ����3���ڱ�ʶ str1 �Ƿ���Ա���0 ������1ʱ���ԣ�������1ʱ���ܱ���0
	int k3 = 1;
	// ����4���ڱ�ʶ str2 �Ƿ���Ա���0
	int k4 = 1;
	// ����5���ڿ���С����ɷ�¼�룬����1ʱ���ԣ���Ϊ1ʱ�������С���㱻����
	int k5 = 1;
	// store�����������ڼĴ��������ڼ�¼�Ƿ��������·��ż�
	JButton store; 
	
	@SuppressWarnings("rawtypes")
	Vector vt = new Vector(20, 10);

    // ��������UI������󲢳�ʼ��
	JFrame frame = new JFrame("Calculator");
	JTextField result_TextField = new JTextField(result, 20);
	JButton clear_Button = new JButton("Clear");
	JButton button0 = new JButton("0");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button_Dian = new JButton(".");
	JButton button_jia = new JButton("+");
	JButton button_jian = new JButton("-");
	JButton button_cheng = new JButton("*");
	JButton button_chu = new JButton("/");
	JButton button_dy = new JButton("=");
	JButton button_dy1 = new JButton("<>");
    // �������Ĺ�����
	public Calculator() {
	
	    // Ϊ��ť���õ�Ч����������ͨ����Ӧ�ļ��̰�������������
		button0.setMnemonic(KeyEvent.VK_0);
		// ������Ч��ʡ�ԣ���������в�������

        // �����ı���Ϊ�Ҷ��룬ʹ����ͽ����������ʾ
		result_TextField.setHorizontalAlignment(JTextField.RIGHT);

        // ��UI�����ӽ�������
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(4, 4, 5, 5));
		pan.add(button7);
		pan.add(button8);
		pan.add(button9);
		pan.add(button_chu);
		pan.add(button4);
		pan.add(button5);
		pan.add(button6);
		pan.add(button_cheng);
		pan.add(button1);
		pan.add(button2);
		pan.add(button3);
		pan.add(button_jian);
		pan.add(button0);
		pan.add(button_Dian);
		pan.add(button_dy);
		pan.add(button_jia);
		//pan.add(button_dy1);
		pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		JPanel pan2 = new JPanel();
		pan2.setLayout(new BorderLayout());
		pan2.add(result_TextField, BorderLayout.WEST);
		pan2.add(clear_Button, BorderLayout.EAST);

        // ���������ڳ�������Ļ�ϵ�λ��
		frame.setLocation(600, 400);
		// ���ô��岻�ܵ���С
		frame.setResizable(true); 
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(pan2, BorderLayout.NORTH);
		frame.getContentPane().add(pan, BorderLayout.CENTER);

		frame.pack();
		frame.setVisible(true);

		// �¼��������

		// ���ּ�
		class Listener implements ActionListener {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				String ss = ((JButton) e.getSource()).getText();
				store = (JButton) e.getSource();
				vt.add(store);
				if (k1 == 1) {
					if (k3 == 1) {
						str1 = "";
						
						// ��ԭ����k5״̬
						k5 = 1;
					}
					str1 = str1 + ss;

					k3 = k3 + 1;
                    
                    // ��ʾ���
					result_TextField.setText(str1);

				} else if (k1 == 2) {
					if (k4 == 1) {
						str2 = "";
						
						// ��ԭ����k5״̬
						k5 = 1; 
					}
					str2 = str2 + ss;
					k4 = k4 + 1;
					result_TextField.setText(str2);
				}

			}
		}

		// �����������ŵĴ���
		class Listener_signal implements ActionListener {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				String ss2 = ((JButton) e.getSource()).getText();
				store = (JButton) e.getSource();
				vt.add(store);

				if (k2 == 1) {
				    // ���� k1 Ϊ 1 ʱ���� 1 д����ֵ��Ϊ2ʱ����2д����ֵ��
					k1 = 2;
					k5 = 1;
					signal = ss2;
					k2 = k2 + 1;// �����ż��Ĵ���
				} else {
					int a = vt.size();
					JButton c = (JButton) vt.get(a - 2);

					if (!(c.getText().equals("+"))
							&& !(c.getText().equals("-"))
							&& !(c.getText().equals("*"))
							&& !(c.getText().equals("/")))

					{
						cal();
						str1 = result;
						// ���� k1 Ϊ 1 ʱ������ 1 дֵ��Ϊ2ʱ����2д
						k1 = 2;
						k5 = 1;
						k4 = 1;
						signal = ss2;
					}
					k2 = k2 + 1;

				}

			}
		}

		// ��������߼���Clear��
		class Listener_clear implements ActionListener {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				store = (JButton) e.getSource();
				vt.add(store);
				k5 = 1;
				k2 = 1;
				k1 = 1;
				k3 = 1;
				k4 = 1;
				str1 = "0";
				str2 = "0";
				signal = "";
				result = "";
				result_TextField.setText(result);
				vt.clear();
			}
		}

		// ���ڼ����߼�
		class Listener_dy implements ActionListener {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {

				store = (JButton) e.getSource();
				vt.add(store);
				cal();
				
				// ��ԭ�������ص�״̬
				k1 = 1; 
				k2 = 1;
				k3 = 1;
				k4 = 1;

				str1 = result; 
			}
		}
		
		// С����Ĵ���
		class Listener_xiaos implements ActionListener {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				store = (JButton) e.getSource();
				vt.add(store);
				if (k5 == 1) {
					String ss2 = ((JButton) e.getSource()).getText();
					if (k1 == 1) {
						if (k3 == 1) {
							str1 = "";
							// ��ԭ����k5״̬
							k5 = 1; 
						}
						str1 = str1 + ss2;

						k3 = k3 + 1;

                        // ��ʾ���
						result_TextField.setText(str1);

					} else if (k1 == 2) {
						if (k4 == 1) {
							str2 = "";
							// ��ԭ����k5��״̬
							k5 = 1;
						}
						str2 = str2 + ss2;

						k4 = k4 + 1;

						result_TextField.setText(str2);
					}
				}

				k5 = k5 + 1;
			}
		}

		// ע������������������¼���Ӧ�߼�������UI�����
		Listener_dy jt_dy = new Listener_dy();
		
		// �������ּ�
		Listener jt = new Listener();
		// �������ż�
		Listener_signal jt_signal = new Listener_signal();
		// ���������
		Listener_clear jt_c = new Listener_clear(); 
		// ����С�����
		Listener_xiaos jt_xs = new Listener_xiaos();

		button7.addActionListener(jt);
		button8.addActionListener(jt);
		button9.addActionListener(jt);
		button_chu.addActionListener(jt_signal);
		button4.addActionListener(jt);
		button5.addActionListener(jt);
		button6.addActionListener(jt);
		button_cheng.addActionListener(jt_signal);
		button1.addActionListener(jt);
		button2.addActionListener(jt);
		button3.addActionListener(jt);
		button_jian.addActionListener(jt_signal);
		button0.addActionListener(jt);
		button_Dian.addActionListener(jt_xs);
		button_dy.addActionListener(jt_dy);
		button_jia.addActionListener(jt_signal);
		clear_Button.addActionListener(jt_c);

		// ����ر��¼�����Ӧ����
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	// �����߼�
	public void cal() {
    	// ������1
		double a2;
		// ������2
		double b2;
		// �����
		String c = signal;
		// ������
		double result2 = 0;

		if (c.equals("")) {
			result_TextField.setText("Please input operator");

		} else {
            // �ֶ�����С���������
			if (str1.equals("."))
				str1 = "0.0";
			if (str2.equals("."))
				str2 = "0.0";
			a2 = Double.valueOf(str1).doubleValue();
			b2 = Double.valueOf(str2).doubleValue();

			if (c.equals("+")) {
				result2 = a2 + b2;
			}
			if (c.equals("-")) {
				result2 = a2 - b2;
			}
			if (c.equals("*")) {
				BigDecimal m1 = new BigDecimal(Double.toString(a2));
			        BigDecimal m2 = new BigDecimal(Double.toString(b2));
			        result2 = m1.multiply(m2).doubleValue();
			}
			if (c.equals("/")) {
				if (b2 == 0) {
					result2 = 0;
				} else {
					result2 = a2 / b2;
				}

			}

			result = ((new Double(result2)).toString());

			result_TextField.setText(result);
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ���ó�����ʾ�Ľ����񣬿���ȥ��
	try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Calculator cal = new Calculator();
	}

}