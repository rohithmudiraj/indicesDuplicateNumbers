package indicesDuplicateNumbers;

public class FindIndex {
	
	private int firstNumber;
	private int secondNumber;
	
	

	public FindIndex(int first, int second) {
		this.firstNumber = first;
		this.secondNumber = second;
	}

	

	
	
	public static FindIndex  really(int[] a,int n) {
		int  count=0;
		int init=0;
		int fina=0;
		for(int i=0;i<a.length-2;i++) {
			
			if(a[i]==n&&a[i+1]==n) {
				
				
				 init=i;
				
				count++;
				
				if(count!=0) {
					 fina=i+count;
				}
			}
				else {
					
					//System.out.println("not same");
				}
				
				
			}
		if(init==0&&fina==0)
		{
			init=-1;
			fina=-1;
		}
		return new FindIndex(init,fina);
		
		}
		
	
	public static void main(String[] args) {
		
		int[] A= new int[]{1,3,3,5,7,9,9,9,15};
		int[] B= new int[]{100,150,150,153};
		

		FindIndex fh =  really(B,10);
	System.out.println(	fh.firstNumber+" "+fh.secondNumber);
		
	}
	}
	

