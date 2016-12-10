import java.util.*;

public class MergeSort {  
       
    public static void main(String[] args) {  
        int[] arr = {7,3,6,2,66,77,55,44,66,79,56,37};  
        MergeSort(arr);
        for (int i = 0; i < arr.length; i++)
        	System.out.print(arr[i]+ " ");
    }  
      
    public static void MergeSort(int[]array){
    	 
    	int length=array.length;
    	int middle=length/2;
    	 
    	if(length>1){
    	 
    	int[]left=Arrays.copyOfRange(array,0,middle);//拷贝数组array的左半部分
    	int[]right=Arrays.copyOfRange(array,middle,length);//拷贝数组array的右半部分
    	MergeSort(left);//递归array的左半部分
    	MergeSort(right);//递归array的右半部分
    	merge(array,left,right);//数组左半部分、右半部分合并到Array
    	 
    	}
    	}
    	 
    	//合并数组，升序
    	private static void merge(int[]result,int[]left,int[]right){
    	 
    	int i=0,L=0,R=0;
    	 
    	while(L<left.length&&R<right.length){
    	 
    	if(left[L]<right[R]){
    	result[i]=left[L];
    	i++;
    	L++;
    	}else{
    	result[i]=right[R];
    	i++;
    	R++;
    	}
    	}
    	 
    	while(R<right.length){//如果右边剩下合并右边的
    	result[i]=right[R];
    	R++;
    	i++;
    	}
    	 
    	while(L<left.length){
    	result[i]=left[L];
    	L++;
    	i++;
    	}
    	}
}