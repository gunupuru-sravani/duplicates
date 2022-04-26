public class DuplicateElement
 {  
    public static void main(String[] args) 
{      


        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   

        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) 
{  
            for(int j = i + 1; j < arr.length; j++)
 {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  
 Java-cp /tmp/GLiM5R0uBW DuplicateElement
Duplicate elements in given array: 
2
3
8
