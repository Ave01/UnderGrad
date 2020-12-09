import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import java.io.*;
import java.util.Scanner;

public class prob11{
	public static void main(String[] args) throws ScriptException, FileNotFoundException{
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		File input = new File("input");
		Scanner scnr = new Scanner(input);
		while(scnr.hasNextLine()){
			String line = scnr.nextLine();
			System.out.println("Equation: " + line + "\nAnswer: " + engine.eval(line));
		}
	}
}
