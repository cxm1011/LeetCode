package LeetCode;

public class findMedianSortedArrays {
	
	public static void main(String args[])
	{
		int a[] = {2,5,7,8};
		int b[] = {3,4};
		System.out.print(findMedianSortedArrays(a,b));
		
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double ans=0;
		int length1 = nums1.length;
		int length2 = nums2.length;
		if(length1==0 && length2==0) return 0;
		int i = 0;
		int j = 0;
		int middle = (length1+length2)/2;
		int flag = 0;
		if((length1+length2)%2 == 1) flag = 1;
		int num = 0 ;
		int[] all = new int[middle+1];
        while(i<length1 && j<length2 && num <= middle)
        {
        	if(nums1[i] <= nums2[j]) 
    		{
        		all[num] = nums1[i];
        		i++;
    		}
        	else 
    		{
        		all[num] = nums2[j];
        		j++;
    		}
        	num++;
        }
        while(i==length1 && num<=middle) 
        {
        	all[num] = nums2[j];
    		j++;
    		num++;
        }
        while(j==length2 && num<=middle) 
        {
        	all[num] = nums1[i];
    		i++;
    		num++;
        }
       
       if(flag == 1) return all[middle];
       else return (all[middle-1]+all[middle])/2.0;
       
    }

}
