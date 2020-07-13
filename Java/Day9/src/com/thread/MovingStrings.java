package com.thread;

import java.awt.*;

import javax.swing.JFrame;

class Move extends JFrame implements Runnable
{
	private Thread t1, t2;
	private int x1=0, x2=450;

	Move()
	{
		setSize(500, 400);

		t1 = new Thread(this, "Tom");
		t2 = new Thread(this, "Jerry");
       	t1.start();
		t2.start();

		setVisible(true);
	}

	public void run()
	{
		while(true)
		{
			if(x1>=450)
				x1=0;
			else
				x1=x1+20;
			if(x2<0)
				x2=450;
			else
				x2=x2-20;
			repaint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setFont(new Font("Arial", Font.BOLD, 40));

		g.setColor(Color.BLUE);
		g.drawString(t1.getName(), x1, 200);

		g.setColor(Color.RED);
		g.drawString(t2.getName(), x2, 200);
	}
}

public class MovingStrings 
{
	public static void main(String[] args) 
	{
		Move m = new Move();
	}
}
