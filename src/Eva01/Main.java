package Eva01;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;



public class Main extends JFrame {

	private JPanel contentPane;
	public static JPanel panel;
	static CardLayout layout;
	public static JPanel buttonPanel;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Main() {
		//フレーム基本設定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		

		//フレーム上部(パネル)
		panel = new JPanel();  //上部パネル
		layout = new CardLayout();  //カードレイアウト
		panel.setLayout(layout);  //上部パネルにカードレイアウトをセット
		
		panel.add(new MisatoRoom(), "MisatoRoom");  //通常時、ミサトの部屋
		panel.add(new NextEpisodeImages(), "NextEpisodeImages");  //レバーオン時、次回予告画像
		panel.add(new NextEpisodeImage(),"nextEpisodeImage");  //第3ボタン停止時、次回予告「最後のシ者」
		
		
		//フレーム下部(ボタン)
		buttonPanel = new ButtonPanel();  //ボタン
//		buttonPanel.setEnabled(false);  //ボタンを押せないように
		
		
		
		
//		if(ButtonPanel.leverOn) {  //レバーオン時、ボタンを押せるように
//			buttonPanel.setEnabled(true);
//			
//		}
		
		
		
//		if(ButtonPanel.lotteryNum==7 && ButtonPanel.buttonCount==3) {
//			((ButtonPanel) buttonPanel).thirdButtonOff();
//		}
		
		
		
		
		
		
		
		
		
		
		//パネルのグループレイアウトのコード
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonPanel, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
		
		
		
		
		
		
		
		
		
		
		
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addGap(0, 424, Short.MAX_VALUE)
//		);
//		gl_contentPane.setVerticalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addGap(0, 251, Short.MAX_VALUE)
//		);
//		contentPane.setLayout(gl_contentPane);
//	}

}
