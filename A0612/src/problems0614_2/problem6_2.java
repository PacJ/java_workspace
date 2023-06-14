package problems0614_2;

//6. Main()을보고코드를작성해라.(c는 1~5까지 합, d는 1~10까지 합)

public class problem6_2 {

	public static void main(String[] args) {

		int a[]={1,2,3,4,5};
		
		int b[]={6,7,8,9,10};
		
		int c=add(a,5);
		
		int d=add(a,5,b);
		
		System.out.println(c);
		
		System.out.println(d);

	}
	
	
	public static int add(int[] nums, int finish) {
			int sum = 0;
			for(int i = 0; i < finish; i++) {
				sum += nums[i];
			}
		return sum;
	}

	public static int add(int[] nums, int finish, int[] nums2) {
		int sum = 0;
		for(int i = 0; i < finish; i++) {
			sum += nums[i];
			sum += nums2[i];
		}
		return sum;
	}
	

}
