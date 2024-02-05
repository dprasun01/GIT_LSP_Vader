package org.howard.edu.lsp.assignment2;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Map;
import java.util.LinkedHashMap;


public class WordCounting {

	public static void main(String[] args) {
		
		String filepath = "src/org/howard/edu/lsp/assignment2/words.txt";
		
		String cwd = System.getProperty("user.dir");
		Path file = Paths.get(cwd, filepath);
		
		try {
            Files.lines(Paths.get(filepath)).forEach(System.out::println);
        } 
		
		catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println();
		System.out.println();
		
		try {
		  
		    Scanner scanner = new Scanner(file);
		    
		    LinkedHashMap <String, Integer> Counter = new LinkedHashMap<String, Integer>();

		    while (scanner.hasNext()) {

		    	String currword = scanner.next().toLowerCase();
//		    	char firstchar = currword.charAt(0);

		    	
		    	if (currword.length() > 3 && !isNumeric(currword)) {
		    		
		    		if (currword.contains("'")) {
			    		String[] words = currword.split("'");
			    		
			    		for (String string : words) {
			                if (string.length() > 3 && !isNumeric(string) && !isInvalid(string)) {
			                	Counter.put(string, Counter.getOrDefault(string, 0) + 1);
			                }
			            }
			    	}

		    		else if (!isInvalid(currword)) {
		    			Counter.put(currword, Counter.getOrDefault(currword, 0) + 1);
		    		}
		    	}
		    	
		    }

		    scanner.close();
		    
		    for (Map.Entry<String, Integer> kvpair : Counter.entrySet()) {
		    	
		    	String key = kvpair.getKey();
		    	Integer value = kvpair.getValue();
		    	
		    	String lineoutput = String.format("%-15s %3d", key, value);
		    	
		    	System.out.println(lineoutput);
		    	
		    }
	
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static boolean isNumeric(String str) {
		
		return str.matches("-?\\d+(\\.\\d+)?");
	}
	
	private static boolean isInvalid(String str) {
		
		return str.matches(".*[^a-zA-Z0-9'].*");
	}

}
