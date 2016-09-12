package LeetCode;

import java.util.Stack;

public class largestRectangleArea {
	public static void main(String args[])
	{
		int[] height = {4,2,0,3,2,5};
		System.out.println(largestRectangleArea(height));
	}
	//O£¨n^2£©time out
    /*public static int largestRectangleArea(int[] heights) 
    {
    	int min = Integer.MIN_VALUE;
    	int len = heights.length;
    	if(len < 1) return 0;
    	if(len == 1) return heights[0];
    	int maxArea = 0;
    	for(int i=0;i<=len-1;i++)
    	{
    		min = heights[i];
    		for(int j=i+1;j<len;j++)
    		{
    			min = Math.min(min, heights[j]);
    			int area = min*(j-i+1);
    			maxArea = Math.max(maxArea, area);
    		}
    	}
    	return maxArea;
	}*/
    //O£¨n£©
    public static int largestRectangleArea(int[] heights) 
    {
    	Stack<Integer> h = new Stack<Integer>();
    	int len = heights.length;
    	if(len < 1) return 0;
    	int max = 0;
    	int width = 0;
    	for(int i=0;i<len;i++)
    	{
    		int height = heights[i];
    		while(!h.empty() && height <= heights[h.peek()])
    		{
    			int heightTemp = heights[h.pop()];
    			if(h.empty()) width = i;
    			else width = i-h.peek()-1;
    			max = Math.max(max, heightTemp*width);
    		}
    		h.push(i);
    	}
    	width = 0;
    	while(!h.empty())
    	{
    		int heightTemp = heights[h.pop()];
    		if(!h.empty()) width = len-h.peek()-1;
    		else width = len;
			max = Math.max(max, heightTemp*width);
    	}
    	
    	return max;
    }
//	public static int largestRectangleArea(int[] height) {
//        if (height == null || height.length == 0) {
//            return 0;
//        }
//        
//        Stack<Integer> stack = new Stack<Integer>();
//        int max = 0;
//        for (int i = 0; i <= height.length; i++) {
//            int curt = (i == height.length) ? -1 : height[i];
//            while (!stack.isEmpty() && curt <= height[stack.peek()]) {
//                int h = height[stack.pop()];
//                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
//                max = Math.max(max, h * w);
//            }
//            stack.push(i);
//        }
//        
//        return max;
//    }
}
