package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	
	public boolean upPressed, downPressed, leftPressed, rightPressed, shift, torch, tf;
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) {
			upPressed = true;
		}
		if(code == KeyEvent.VK_S) {
			downPressed = true;
		}
		if(code == KeyEvent.VK_A) {
			leftPressed = true;
		}
		if(code == KeyEvent.VK_D) {
			rightPressed = true;
		}
		if(code == KeyEvent.VK_SHIFT) {
			shift = true;
		}
		
		if(torch == false) {
			if(code == KeyEvent.VK_E) {
				torch = true;
			}
		}
		else if(torch == true) {
			if(code == KeyEvent.VK_E) {
				torch = false;
			}
		}
		
		if(tf == false) {
			if(code == KeyEvent.VK_T) {
				tf = true;
			}
		}
		else if(tf == true) {
			if(code == KeyEvent.VK_T) {
				tf = false;
			}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) {
			upPressed = false;
		}
		if(code == KeyEvent.VK_S) {
			downPressed = false;
		}
		if(code == KeyEvent.VK_A) {
			leftPressed = false;
		}
		if(code == KeyEvent.VK_D) {
			rightPressed = false;
		}
		if(code == KeyEvent.VK_SHIFT) {
			shift = false;
		}
		
		
		
	}

}
