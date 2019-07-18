package com.automatas;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ManoRobotas {
			
	public static void AltTab(Robot robot) {
		robot.keyPress(KeyEvent.VK_ALT);
		robot.delay(200);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ALT);
		
	}

	public static void Tab(Robot robot, int kiek) {

		for (int i = 0; i < kiek; i++) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(80);
		}
	}

	public static void CtrlV(Robot robot) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(150);
	}
	public static void CtrlA(Robot robot) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(150);
	}
}
