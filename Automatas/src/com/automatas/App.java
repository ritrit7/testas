package com.automatas;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;

public class App {

	public static void main(String[] args) throws Exception {
		
		final JFileChooser fc = new JFileChooser("C:\\trafaretai\\"); // pasirenkam faila sablonam
		fc.setPreferredSize (new java.awt.Dimension (800, 800));
		int returnValue = fc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fc.getSelectedFile();
			selectedFile.getAbsolutePath();
			FailoVardas.failas = selectedFile.getAbsolutePath();
		}
		else return;
						
		TextFromFile TFF = new TextFromFile(); // Pasidarom objekta  failui skaityti
		          
		Robot robot = new Robot();
		robot.delay(300);
		ManoRobotas.AltTab(robot); // persokam i esis langa
		robot.delay(100);
			
		
		TFF.Get(1); // paimam pirma eilute is failo    TLK kodas         
		InputToClipboard.textas(TFF.te); // iraðom á clipboarda TLK koda  
		ManoRobotas.CtrlV(robot); // iðvedam clipboardo turini
		robot.delay(1000); // laukiam kol sistema suras duombazej 
		robot.keyPress(KeyEvent.VK_DOWN); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(300);
		ManoRobotas.Tab(robot, 1);
		robot.delay(300);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.delay(300);
		ManoRobotas.Tab(robot, 8);
		
		robot.delay(300);
		TFF.Get(2); // paimam antra eilute is failo bus klinikine diagnoze  
		System.out.println(TFF.te);
		InputToClipboard.textas(TFF.te); // iraðom á clipboarda 
		ManoRobotas.CtrlV(robot); // iðvedam clipboardo turini
		
		TFF.Get(3);             
		InputToClipboard.textas(TFF.te);  
		ManoRobotas.Tab(robot, 6); // tabinam nusiskundimai ir anamneze
		ManoRobotas.CtrlA(robot);
		ManoRobotas.CtrlV(robot);
		
		ManoRobotas.Tab(robot, 22); //  objektyviai
		TFF.Get(4);             
		InputToClipboard.textas(TFF.te);
		ManoRobotas.CtrlA(robot);
		ManoRobotas.CtrlV(robot);
		
		
		ManoRobotas.Tab(robot, 6); // tyrimu planas
		TFF.Get(5);             
		InputToClipboard.textas(TFF.te);
		ManoRobotas.CtrlA(robot);
		ManoRobotas.CtrlV(robot);
		
	
		ManoRobotas.Tab(robot, 7); // atlikti tyrimai
		TFF.Get(6);             
		InputToClipboard.textas(TFF.te);  
		ManoRobotas.CtrlV(robot);
		

		ManoRobotas.Tab(robot, 8); // medikamentinis gydymas
		TFF.Get(7);             
		InputToClipboard.textas(TFF.te);  
		ManoRobotas.CtrlV(robot);
		
		ManoRobotas.Tab(robot, 6); // taikytas gydymas
		TFF.Get(8);             
		InputToClipboard.textas(TFF.te);
		ManoRobotas.CtrlA(robot);
		ManoRobotas.CtrlV(robot);
		
		ManoRobotas.Tab(robot, 15); // rekomendacijos
		TFF.Get(9);             
		String pakeistas = TFF.te.replace("\\n",""+(char)10); // pakeiciam \\ i naujos eilutes zenkla
		InputToClipboard.textas(pakeistas);  
		ManoRobotas.CtrlA(robot);
		ManoRobotas.CtrlV(robot);
		
		ManoRobotas.Tab(robot, 7); // pastabos
		TFF.Get(10);             
		InputToClipboard.textas(TFF.te);  
		ManoRobotas.CtrlV(robot);
		
				

	}

}
