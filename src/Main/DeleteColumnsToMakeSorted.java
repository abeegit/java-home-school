package Main;
import java.util.*;

class DeleteColumnsToMakeSorted {
    private HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
    
    public DeleteColumnsToMakeSorted() {
		this.characterMap.put('a', 1);
		this.characterMap.put('b', 2);
		this.characterMap.put('c', 3);
		this.characterMap.put('d', 4);
		this.characterMap.put('e', 5);
		this.characterMap.put('f', 6);
		this.characterMap.put('g', 7);
		this.characterMap.put('h', 8);
		this.characterMap.put('i', 9);
		this.characterMap.put('j', 10);
		this.characterMap.put('k', 11);
		this.characterMap.put('l', 12);
		this.characterMap.put('m', 13);
		this.characterMap.put('n', 14);
		this.characterMap.put('o', 15);
		this.characterMap.put('p', 16);
		this.characterMap.put('q', 17);
		this.characterMap.put('r', 18);
		this.characterMap.put('s', 19);
		this.characterMap.put('t', 20);
		this.characterMap.put('u', 21);
		this.characterMap.put('v', 22);
		this.characterMap.put('w', 23);
		this.characterMap.put('x', 24);
		this.characterMap.put('y', 25);
		this.characterMap.put('z', 26);
	}
    /**
     * abc
     * bcd
     * cae
     * @param strs
     * @return
     */
    public int minDeletionSize(String[] strs) {
    	int deletionSize = 0;
    	
    	int columnSize = strs[0].length();
    	int rowSize = strs.length;
    	
    	for (int i = 0; i < columnSize; i++) {
    		for (int j = 1; j < rowSize; j++) {
    			if (strs[j].charAt(i) < strs[j-1].charAt(i)) {
    				deletionSize++;
    				break;
    			}
    		}
    	}
        
        return deletionSize;
    }
    
    public static void main(String[] args) {
    	DeleteColumnsToMakeSorted cl = new DeleteColumnsToMakeSorted();
    	String[] strs = new String[]{"a","b","a"};
    	System.out.println(cl.minDeletionSize(strs));
    }
}
