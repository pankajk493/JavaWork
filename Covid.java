package codechef;
import java.util.*; 
public class Covid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0) {
        	int N=scan.nextInt();
        	int K=scan.nextInt();
        	int X=scan.nextInt();
        	int Y=scan.nextInt();
        	int j=0;
        if(Y>N){
        	System.out.println("NO");
        	}
        else {
        	for(int i=1;i<=N;i++) {
        		if((X+K*i)%N==Y) {
        			System.out.println("YES");
        			j=1;
        			break;
        		}
        	}
        	}
        	if(j==0){
        		System.out.println("NO");
        	}
        }
        		
        }
	}

