/**
 * Purpose: Taking input from a file and saving the number in a hash map.
 * search a number if present pop it or else insert it 
 * 
 * @author Kumar Shubham
 * @since  07-04-2018
 *
 */

package com.bridgeit.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgeit.utility.Utility;

public class Hashing {
	
	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		System.out.println("Enter the size");
		int size = utility.inputInteger();
		HashChaining hc = new HashChaining(size);
		File file = new File("/home/bridgeit/eclipse-workspace/Bridgeit/DataStructurePrograms/HashInput");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		String st;
		while ((st = br.readLine()) != null) {
			str = str + st;
		}
		br.close();
		for (String fileString : str.split("\\s", 0)) {
			int number = Integer.parseInt(fileString);
			hc.insert(number);
		}
		System.out.println("Find the number to be searched");
		int value = utility.inputInteger();
		hc.search(value);
		hc.display();
		hc.write();
	}
}
