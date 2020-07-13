package exercise;

import java.awt.*;
import java.awt.event.*;

class RP_InnerEx8 {
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
