package LeetCode;

public class maxArea {
	
	public static void main(String args[])
	{
		int[] height={2,2,3,4};
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
        int ans = 0;
        int len = height.length;
        if(len == 0) return 0;
        int left = 0;
        int right = len-1;
        int min = 0;
        int s =0;
        while(left!=right)
        {
        	min = height[left];
        	if(height[right] < height[left]) min = height[right];
        	s = min*(right-left);
        	if(s> ans) ans = s;
        	if(min == height[left]) left++;
        	else right--;
        }
        return ans;
    }

}
