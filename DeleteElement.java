import java.util.*;
 class error
{ 
	public static void main(String[] args)
     {
         //int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int n=sc.nextInt();
	int arr[]=new int [n];
	for(int i=0; i<n; i++)
    {
	    System.out.print((i+1)+" element: ");
	    arr[i]=sc.nextInt();
	}
	System.out.print("Elemets are: ");
	for(int i=0; i<n; i++){
	    System.out.print(arr[i]+" ");
	}
	System.out.print("\nEnter which Element to delete: ");
	int del=sc.nextInt();
	int k;
	for( k=0; k<n; k++)
    {
	    if(arr[k]==del)
        {            
	        break;
	    } 
	}   
    
	for(int j=k; j<n-1; j++){
	    arr[j]=arr[j+1];
	}
	System.out.print("After deletion: ");
	for(int i=0; i<n-1; i++){
	    System.out.print(arr[i]+" ");
	}
	
	}
}
