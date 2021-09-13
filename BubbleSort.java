/*
Basically there is an numerous sortin techniques are there:
I am going to choose BubbleSort:

Alogorithm or Psuedocode:

step 1:input array to be sorted
step 2:repeat step 3 for i<--- 0 to n:
[loop]
step 3:repeat step 4 for j<--- 0 to n:
[loop]
step 4: if a[i]<a[j] then
         swapp a[i] with a[j]
[end loop]
[end loop]
step 5:exit

*/






public class BubbleSort{
	public static void main(String args[]){
		int[] a={10,9,6,21,45,90};
        int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
			if(a[i]<a[j]){
             temp=a[i];
 			 a[i]=a[j];
			 a[j]=temp;//swapping elements
		}
			}
		}
         for(int i=0;i<a.length;i++){
	 System.out.println("sorted elemnts"+" "+a[i]);
}
	
	
}
}