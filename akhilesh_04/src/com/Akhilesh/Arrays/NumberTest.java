package com.Akhilesh.Arrays;
import java.util.*;

public class NumberTest {

	
	public static void main(String[] args) {
		
		float arr[] = new float[] {(float) 25.70, (float) 16.25, (float)45.85,(float) 35.5, (float)12.25};
		float sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		float average=sum/(arr.length);
		System.out.println("The average is: "+average);		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>12 && arr[i]<40) {
				arr[i]+=2.5;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Updated array element"+ i +" : " +arr[i]);
		}
	}

		
}
