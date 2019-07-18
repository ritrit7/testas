package com.automatas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFromFile {

	public String te;

	void Get(int eilute) throws FileNotFoundException {

		String fileName = FailoVardas.failas;
		File textFile = new File(fileName);
		Scanner in = new Scanner(textFile);

		// skanuoja pirma eilute is failo
		for (int i = 0; i < eilute; i++)
			te = in.nextLine();

		in.close();

	}

}
