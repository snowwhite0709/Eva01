//第3ボタン停止時の画像

package Eva01;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NextEpisodeImage extends JPanel {

	
	public NextEpisodeImage() {
		
		JLabel lblNewLabel = new JLabel("");
		
		//次回予告
				//"C:\Users\3030855\git\Eva01\file\次回予告①.jpg"
		lblNewLabel.setIcon(new ImageIcon("\"C:\\Users\\3030855\\git\\Eva01\\file\\次回予告①.jpg\""));
//		add(lblNewLabel);
		
		
//		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\予告.jpg"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(2)
					.addComponent(lblNewLabel)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		

	

	}

}
