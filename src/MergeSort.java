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
    	 
    	int[]left=Arrays.copyOfRange(array,0,middle);//��������array����벿��
    	int[]right=Arrays.copyOfRange(array,middle,length);//��������array���Ұ벿��
    	MergeSort(left);//�ݹ�array����벿��
    	MergeSort(right);//�ݹ�array���Ұ벿��
    	merge(array,left,right);//������벿�֡��Ұ벿�ֺϲ���Array
    	 
    	}
    	}
    	 
    	//�ϲ����飬����
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
    	 
    	while(R<right.length){//����ұ�ʣ�ºϲ��ұߵ�
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