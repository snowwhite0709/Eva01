//レバーオン時から始まる次回予告画像集

package Eva01;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NextEpisodeImages extends JPanel {
//	static ImageIcon[] imageIcons = new ImageIcon[6];
	static JLabel lblNewLabel;
//	static ArrayList<ImageIcon> imageIcons;
	
	
	
	
	/**
	 * Create the panel.
	 */
	
	
	public static void NextEpisode() {
//		Animationインスタンスの作成(Threadで画像切替開始)
		
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru.jpeg"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru.jpeg"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru1.jpg"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru2.png"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru3.jpg"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru4.png"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru5.png"));
		
		
		
//		Animation anime = new Animation (lblNewLabel,imageIcons);
//		anime.start();
	}
	
	public NextEpisodeImages() {
		
		//ちかる画像配列
//		imageIcons[0] = {new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru.jpeg")};
		
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru.jpeg"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru.jpeg"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru1.jpg"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru2.png"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru3.jpg"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru4.png"));
//		imageIcons.add(new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru5.png"));
		
		
	
		////ちかる
//		ImageIcon[] imageIcons = 
//			{//new ImageIcon("C:\\Users\\智志\\Desktop\\eva\\予告.jpg"),
//			new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru.jpeg"), 
//			new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru1.jpg"),
//			new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru2.png"),
//			new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru3.jpg"),
//			new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru4.png"),
//			new ImageIcon("C:\\Users\\智志\\Desktop\\スマホ\\アサルトリリィ\\ちかる\\thikaru5.png")
//			};
		
		
		////魂の軌跡
		ImageIcon[] imageIcons = 
			{//new ImageIcon("C:\\Users\\智志\\Desktop\\eva\\予告.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\①.jpg"), 
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\②.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\③.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\④.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑤.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑥.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑦.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑧.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑨.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑩.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑪.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑫.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑬.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑭.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑮.jpg"),
			new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\⑯.jpg")
			};
		
		
		
		//予告
		lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\3030855\\git\\Eva01\\file\\予告.jpg"));
				
		
		Animation anime = new Animation (lblNewLabel,imageIcons);
		anime.start();
		
		
		
		
		
		//Animationインスタンスの作成(Threadで画像切替開始)
//		Animation anime = new Animation (lblNewLabel,imageIcons);
//		anime.start();
		
		
		
		//グループレイアウトコード
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		
		
		

	}

}
