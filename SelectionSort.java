package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {3,1,-2,7,4,0};
        int n=a.length;
        for(int i=0;i<n-1;i++) {
        	int minInd=i;
        	for(int j=i;j<n;j++) {
        		if(a[minInd]>a[j]) {
        			minInd=j;
        		}
        	}
        	int temp=a[i];
        	a[i]=a[minInd];
        	a[minInd]=temp;
        }
        for(int e:a) {
        	System.out.print(e+" ");
        }
	}

}
