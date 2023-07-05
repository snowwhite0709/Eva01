//Threadクラス

package Eva01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Animation extends Thread {
	public JLabel label;//ラベルのフィールド
	public ImageIcon[] imgs;
//	public ArrayList<ImageIcon> imgs;//イメージのフィールド


	public Animation(JLabel label ,ImageIcon[] imgs){
		this.label=label;
		this.imgs=imgs;
	}

	
	public void run(){
		for(int i =0;;i++){
			try {
				sleep(800);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
//			label.setIcon(imgs.get(i%6));
//			label.setIcon(imgs[i%6]);  //ちかる
			label.setIcon(imgs[i%16]);  //エヴァ
		}
	}



}
