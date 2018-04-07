import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.*;  
import javax.swing.JFrame;  
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library extends JFrame{

static Library frame;
private JPanel contentPane;

public Library(){

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 371);



contentPane=new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
JLabel lblLibraryManagement=new JLabel("Library Management");


lblLibraryManagement.setForeground(Color.gray);
lblLibraryManagement.setFont(new Font("Tahoma", Font.PLAIN, 20));
JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin.main(new String[]{});
			frame.dispose();


			}
		});
JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[]{});
			}
		});

GroupLayout gcontentPane=new GroupLayout(contentPane);
               
gcontentPane.setHorizontalGroup(
    gcontentPane.createParallelGroup()
   .addGroup(gcontentPane.createSequentialGroup()
    .addGap(127)
.addComponent(lblLibraryManagement, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					)
      .addGroup(gcontentPane.createSequentialGroup()
           .addGap(125)
           .addGroup(gcontentPane.createParallelGroup()
           .addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
          .addGap(12)
                   .addComponent(btnLibrarianLogin, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
           )));

           
         
gcontentPane.setVerticalGroup(
      gcontentPane.createSequentialGroup()
					
					.addGap(40)
                                        .addComponent(lblLibraryManagement, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				         .addGap(20)
					.addComponent(btnLibrarianLogin, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					
		);
contentPane.setLayout(gcontentPane);
               }



public static void main(String args[]){
EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new Library();
					  
					frame.setVisible(true); 
        
			} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
}
