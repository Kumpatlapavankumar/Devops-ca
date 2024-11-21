import java.util.*;
//excellent work
public class palindromstring{
    public static void main(String[] args){
        String name="madam";
        char[] arr=name.toCharArray();
        reverse(arr,0,arr.length-1);
        String reversed = new String(arr);
        if(name.equals(reversed)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
	//donot edit this file
    public static void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}