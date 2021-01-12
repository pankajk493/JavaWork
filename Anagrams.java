package strings;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="aab";
        String b="abc";
    	boolean isAnagram=true;
//        boolean visited[]=new boolean[b.length()];
//        if(a.length()==b.length()) {
//        for(int i=0;i<a.length();i++) {
//        	char c=a.charAt(i);
//        	isAnagram=false;
//        	for(int j=0;j<b.length();j++) {
//        		if(b.charAt(j) == c && !visited[j]) {
//        			visited[j]=true;
//        			isAnagram=true;
//        			break;
//        		}	
//        	}
//        	if(!isAnagram) {
//        		break;
//        	}
//        }
//        }
    	int an[]=new int[256];
    	int bn[]=new int[256];
    	for(char c:a.toCharArray()) {
    		int index=(int) c;
    		an[index]++;
    	}
    	for(char c:b.toCharArray()) {
    		int index=(int) c;
    		bn[index]++;
    	}
    	for(int i=0;i<256;i++) {
    		if(an[i]!=bn[i]) {
    			isAnagram=false;
    			break;
    		}
    	}
        if(isAnagram) {
        	System.out.println("anagram");
        }else {
        	System.out.println("not anagram");
        }
	}

}
