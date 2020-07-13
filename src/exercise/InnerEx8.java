package exercise;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("Start");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("ActionEvent occured!!!");
			}
		});

	}

}

//class EventHandler implements ActionListener{
//	public void actionPerformed(ActionEvent e){
//		System.out.println("ActionEvent occured!!!");
//	}
//}