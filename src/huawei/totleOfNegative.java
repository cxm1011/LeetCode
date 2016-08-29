package huawei;

import java.util.*;

public class totleOfNegative {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int count1 = 0;
        int count2 = 0;
        float sum = 0;
        while(in.hasNext()){
            int n = in.nextInt();
            if(n<0){
                count1++;
            }else{
                count2++;
                sum+=n;
            }
        }
        float average = sum/count2;
        System.out.println(count1);
        System.out.printf("%.1f\n",average);
	}
}
