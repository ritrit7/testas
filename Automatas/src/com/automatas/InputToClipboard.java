package com.automatas;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
//import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class InputToClipboard {

	public static void textas(String t) throws Exception {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection tekstas = new StringSelection(t);
		clipboard.setContents(tekstas,tekstas);
		//String result = (String) clipboard.getData(DataFlavor.stringFlavor);
		//System.out.println("String from Clipboard:" + result);
	}

}