package Week02.Day02;

import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

//import org.junit.Test;

public class breakOut01 {
	/*
	 positive [3,2,4]
	 
	
Psudocode:
         1. create a hash map and enter key and value with loop
         2. for loop where difference = target - arr[i]
             a. if
	 
	 */
//HashMap<String, Integer> map=new HashMap<String, Integer>();
//Map.Entry<K, V>
	@Test
	public void addMenuItem() {
		/*
		 * mapingKeyValue("Idly", 20); mapingKeyValue("Vada", 10);
		 * mapingKeyValue("Dosai", 30); mapingKeyValue("Poori", 30);
		 * mapingKeyValue("Pongal", 40); System.out.println(map);
		 */
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("Idly", 20);
		map.put("Dosai", 30);
		map.put("Poori", 40);
		System.out.println(map);
		
	}
//	public void printMenuItem() {
//		System.out.println();
//	}
//	public void mapingKeyValue(String item, Integer price) {
//		HashMap map=new HashMap();
//	
//		map.put(item,price);
		//return map;
		//System.out.println(map);
		
	}

