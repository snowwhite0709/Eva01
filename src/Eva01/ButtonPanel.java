package Eva01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.Clip;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;



public class ButtonPanel extends JPanel {
	static int count = 0;
	JButton btnNewButton = new JButton("MAXBET");
	JButton btnNewButton_1 = new JButton("lever");
	JButton btnNewButton_2 = new JButton("left");
	JButton btnNewButton_3 = new JButton("center");
	JButton btnNewButton_4 = new JButton("right");


	static boolean maxbetOn = true;
	static int maxbetCount = 0;
	static int leverCount = 0;
	static boolean leverOn = false;
	static int buttonCount = 0;
	static boolean leftButton = false;
	static boolean centerButton = false;
	static boolean rightButton = false;

	static int lotteryNum;
	
	static int GameCount=0;


	//BGM関連
	Clip nextEpisodeBGM;  //レバーオン時、次回予告BGM
	Clip nextEpisodeBGM_1;  //第3停止時、次回予告BGM
	Clip impactFlash;  //第3停止時、インパクトフラッシュ



	public ButtonPanel() {


		btnNewButton_1.setEnabled(false);  //レバー押下できない状態
		buttonOff();  //ボタン押下できない状態


		//グループレイアウトのコード
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnNewButton_1)
										.addGap(41)
										.addComponent(btnNewButton_2)
										.addGap(28)
										.addComponent(btnNewButton_3)
										.addGap(18)
										.addComponent(btnNewButton_4)))
						.addContainerGap(75, Short.MAX_VALUE))
				);



		//maxbetオン
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(maxbetOn) {
					misato();
					btnNewButton_1.setEnabled(true);
					btnNewButton.setEnabled(false);
					leverOn = true;
				}
			}
		});



		//レバーオン
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameCount++;
				System.out.println("ゲーム数："+GameCount);
				Lottery lottery = new Lottery();
				lotteryNum = lottery.getLotteryNum();

				if(lotteryNum==0) {
					if(leverOn) {
						System.out.println("当たり");
						//次回予告BGM
						nextEpisodeBGM = BGM.createClip(new File("C:\\Users\\3030855\\git\\Eva01\\file\\新世紀エヴァンゲリオンBGM　次回予告-from-YouTube.wav"));
						nextEpisodeBGM.setFramePosition(1120000);
						nextEpisodeBGM.setFramePosition(60000);
						nextEpisodeBGM.setLoopPoints(60000, 1090000);
						nextEpisodeBGM.loop(Clip.LOOP_CONTINUOUSLY);
						nextEpisodeBGM.start();

						//次回予告
						Main.panel.add(new NextEpisodeImages(), "NextEpisodeImages");
						Main.layout.show(Main.panel, "NextEpisodeImages");

						//ボタンオン
						buttonOn();
						leftButton = true;
						centerButton = true;
						rightButton = true;
						btnNewButton_1.setEnabled(false);  //レバーを押せない状態に
					}
				} else {
					if(leverOn) {
						System.out.println("はずれ");
						//ボタンオン
						buttonOn();
						leftButton = true;
						centerButton = true;
						rightButton = true;
						btnNewButton_1.setEnabled(false);  //レバーを押せない状態に
					}


				}
				System.out.println("=====================");
			}
		});



		
		
			//左ボタン
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lotteryNum==0) {
						if(leftButton) {
							buttonCount++;
//							System.out.println(buttonCount);
							btnNewButton_2.setEnabled(false);
							if(buttonCount==3) {
								btnNewButton_2.setActionCommand("nextEpisodeImage");
								thirdButtonOff();
							}
						}
//						System.out.println("left");
					} else {
						if(leftButton) {
							buttonCount++;
//							System.out.println(buttonCount);
							btnNewButton_2.setEnabled(false);
							if(buttonCount==3) {
								buttonOff();
								buttonCount=0;
								btnNewButton.setEnabled(true);
							}
						}
//						System.out.println("left");
					}
				}
			});


			//中ボタン
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lotteryNum==0) {
						if(centerButton) {
							buttonCount++;
//							System.out.println(buttonCount);
							btnNewButton_3.setEnabled(false);
							if(buttonCount==3) {
								btnNewButton_3.setActionCommand("nextEpisodeImage");
								thirdButtonOff();
							}
						}
//						System.out.println("center");
						
					} else {
						if(leftButton) {
							buttonCount++;
//							System.out.println(buttonCount);
							btnNewButton_3.setEnabled(false);
							if(buttonCount==3) {
								buttonOff();
								buttonCount=0;
								btnNewButton.setEnabled(true);
							}
						}
//						System.out.println("center");
						
					}
					
					
				}
			});


			//右ボタン
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(lotteryNum==0) {
						if(rightButton) {
							buttonCount++;
//							System.out.println(buttonCount);
							btnNewButton_4.setEnabled(false);
							if(buttonCount==3) {
//								System.out.println("buttonCount");
								btnNewButton_4.setActionCommand("nextEpisodeImage");
								thirdButtonOff();
							}
						}
//						System.out.println("right");	
					} else {
						if(leftButton) {
							buttonCount++;
//							System.out.println(buttonCount);
							btnNewButton_4.setEnabled(false);
							if(buttonCount==3) {
								buttonOff();
								buttonCount=0;
								btnNewButton.setEnabled(true);
							}
						}
//						System.out.println("right");
					}
					
					
				}
			});

		

		

		//グループレイアウトのコード
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnNewButton)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_1)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_4)
								.addComponent(btnNewButton_3))
						.addContainerGap(38, Short.MAX_VALUE))
				);
		setLayout(groupLayout);

	}









	////メソッド	
	public void actionPerformed(ActionEvent e) {
//		if(lotteryNum==7 && buttonCount==3) {
//			System.out.println("aaa");
//		}
		
		
		
//		
//		String cmd = e.getActionCommand();
//		if(cmd.equals("nextEpisode")) {
//			Main.panel.add(new NextEpisodeImage(),"nextEpisodeImage");
//		}
//		Main.layout.show(Main.panel, cmd);
	}


	//ミサトの部屋を表示するメソッド
	public void misato() {
		Main.panel.add(new MisatoRoom(), "MisatoRoom");
		Main.layout.show(Main.panel, "MisatoRoom");
	}


	public void nextEpisodeImages() {
		Main.panel.add(new NextEpisodeImages(), "NextEpisodeImages");
		Main.layout.show(Main.panel, "NextEpisodeImages");
	}


	//予告を表示するメソッド
	public void nextEpisode() {
		Main.panel.add(new NextEpisodeImage(),"nextEpisodeImage");
		Main.layout.show(Main.panel, "nextEpisodeImage");
		
		
	}


	//左、中、右ボタンを押下できるメソッド
	public void buttonOn() {
		btnNewButton_2.setEnabled(true);
		btnNewButton_3.setEnabled(true);
		btnNewButton_4.setEnabled(true);
	}


	//左、中、右ボタンを押下できないメソッド
	public void buttonOff() {
		btnNewButton_2.setEnabled(false);
		btnNewButton_3.setEnabled(false);
		btnNewButton_4.setEnabled(false);
	}


	//第3ボタン停止時の処理メソッド
	public void thirdButtonOff() {
		
		//スレッドを停止
		Thread.interrupted();

		//BGM関連の処理
		nextEpisodeBGM.stop();
		nextEpisodeBGM.flush();
		nextEpisodeBGM_1 = BGM.createClip(new File("C:\\Users\\3030855\\git\\Eva01\\file\\新世紀エヴァンゲリオンBGM　次回予告-from-YouTube.wav"));
		nextEpisodeBGM_1.setFramePosition(1120000);
		nextEpisodeBGM_1.start();
		//↓MP３ではないものをコピペする
//		impactFlash = BGM.createClip(new File("C:\\Users\\智志\\Desktop\\eva\\エヴァンゲリオン　インパクトフラッシュ-from-YouTube.wav"));
//		FloatControl ctrl = (FloatControl)impactFlash.getControl(FloatControl.Type.MASTER_GAIN);
//		impactFlash.start();
//		ctrl.setValue(6);

		//画像の処理
		nextEpisode();

		//ボタンの処理
		buttonOff();
		buttonCount=0;
		maxbetOn = true;
		btnNewButton.setEnabled(true);
	}

}








