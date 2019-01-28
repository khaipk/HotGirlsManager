package login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Face extends JFrame{
JLabel label1, label2, label3, label4;
JButton but1, but2, but3, but4;
JTextField txt1;
JPasswordField txt2;
JPanel panel;
JRadioButton radio1, radio2;
String sex[] = {"male","female"};
JComboBox combo ;

	public Face()
	{
		super("Login Board");
		label1 = new JLabel("Tài khoản:");
		label2 = new JLabel("Mật khẩu:");
		label3 = new JLabel("Giới tính:");
		label4 = new JLabel("About you:");
		but1   = new JButton("Login");
		but2   = new JButton("Exit");
		but3   = new JButton("Sign up");
		txt1   = new JTextField();
		txt2   = new JPasswordField();
		panel  = new JPanel();
		combo  = new JComboBox(sex);
		but4   = new JButton("Check sex");
		radio1 = new JRadioButton("Cute");
		radio2 = new JRadioButton("Sexy");
		
		panel.setLayout(null);
		label1.setBounds(20, 20, 100, 20);
		label2.setBounds(20, 50, 100, 20);
		txt1.setBounds(130, 20, 100, 20);
		txt2.setBounds(130, 50, 100, 20);
		label3.setBounds(20, 80, 100, 20);
		combo.setBounds(130, 80, 100, 20);
		but4.setBounds(20, 120, 100, 20);
		but1.setBounds(20, 150, 100, 20);
		but2.setBounds(20, 210, 100, 20);
		but3.setBounds(20, 180, 100, 20);
		label4.setBounds(160, 120, 90, 20);
		radio1.setBounds(130, 150, 80, 20);
		radio2.setBounds(208, 150, 80, 20);
		
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(txt1);
		panel.add(txt2);
		panel.add(combo);
		panel.add(label4);
		panel.add(radio1);
		panel.add(radio2);
		this.add(panel);
		
		but1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(combo.getSelectedItem().equals("male"))
				{
					JOptionPane.showMessageDialog(null, "I am only interested with hot girls");
				}
				else
				JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
			}
		});
		but2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		but3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Phải yêu anh mới được làm thành viên");
			}
		});
		but4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = "";
				if (radio1.isSelected()) s+=(" and "+radio1.getText());
				if (radio2.isSelected()) s+=(" and "+radio2.getText());
				JOptionPane.showMessageDialog(null, "You are "+combo.getSelectedItem()+s);
			}
		});
	}
}
