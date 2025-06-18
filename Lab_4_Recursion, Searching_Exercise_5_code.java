package programmingIIlap;

public class BinarySearchRec {
	int binarySearchRec(int arr[],int L, int R, int x){
		if(R >L) {
			int mid =L+(R-L)/2;
			if(arr[mid]==x)
				return mid;
			else if (arr[mid]>x)
				return binarySearchRec(arr,L,mid-1,x);
			else
				return binarySearchRec(arr,mid+1,R,x);
		}
		return -1;
	}
	public static void main(String args[]) {
		BinarySearchRec ob= new BinarySearchRec();
		int arr[]= {2,3,4,10,40};
		int n=arr.length;
		int x=10;
		int result = ob.binarySearchRec(arr,0,n-1,x);
		if(result==-1)
			System.out.println("Element not present");
		else
			System.out.println(x+"found at index"+result);
		


	}
	

}