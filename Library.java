package libraryManagement;
import java.awt.Image;


import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library extends JFrame {
	static Library frame;
	private JPanel panel;

	
	public static void main(String[] args) {
		
				try {
					frame= new Library();
					frame.setVisible(true);
					frame.setTitle("CIC LIBRARY");
				} catch (Exception e) {
					System.out.println(e);
				}
			
		
	}

	//creating the frame
	public Library() {
		
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		
		/**JLabel blabel=new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/home/yash/Downloads/4x5ft-Vinyl-Background-Studio-Screen-Solid-Color-Background-Fashion-WoodFloor-Backdrop-1-25-W-x1-5.jpg_640x640.jpg")).getImage();
        blabel.setIcon(new ImageIcon(img));
        blabel.setBounds(100,100,450,300);
		*/
		JLabel label= new JLabel("----------------PORTAL----------------");
		label.setFont(new Font("URW Gothic L", Font.BOLD, 20));
		label.setForeground(Color.GRAY);
		//getContentPane().add(blabel);
		
		JButton admin = new JButton("Admin Login");
		admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin.main(new String[]{});
			frame.dispose();
			}
		});
		admin.setFont(new Font("Purisa", Font.PLAIN, 15));
		
		JButton lib= new JButton("Librarian Login");
		lib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[]{});
			}
		});
		lib.setFont(new Font("Purisa", Font.PLAIN, 15));
		
		GroupLayout gl_Panel = new GroupLayout(panel);
		gl_Panel.setHorizontalGroup(
			gl_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Panel.createSequentialGroup()
					.addGroup(gl_Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Panel.createSequentialGroup()
							.addGap(64)
							.addComponent(label))
						.addGroup(gl_Panel.createSequentialGroup()
							.addGap(140)
							.addGroup(gl_Panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lib, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(admin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_Panel.setVerticalGroup(
			gl_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addGap(35)
					.addComponent(admin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lib, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		panel.setLayout(gl_Panel  );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

