package com.Question;

public class Array1 {
public static void main(String[] args) {
	int ar1[] = {0,1,0,0,0,0};
	int ar2[] = {1,0,1,0,0,1};
}
public int printSubArray(int arr1[],int arr2[], int length) {
	int maxlen=0;
	int sum1= 0; int sum2 = 0;
	for(int i= 0 ; i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			sum1 += arr1[i];
			sum2 += arr2[j];
			if(sum1==sum2) {
				int len= j-i+1;
				if(len>maxlen) {
					len = maxlen;
				}
			}
		}
		
	}
	return maxlen;
}
}
