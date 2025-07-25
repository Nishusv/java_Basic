import java.util.Arrays;

public class NonPrimitive {
    public static void main(String args[]){
        //String Example 
       //  String mystr = "hello World";
        //Array Example
        int[] arr = new int[5];
        int[] myarr = new int[] {1,2,3,4,5,6};
        System.out.println(myarr);
        System.out.println(arr);
         /* Out put for the above 
        [I@2a139a55
[I@15db9742
Explanation:
[: Indicates that the object is an array.
I: Represents the primitive type of the array elements, which in this case is int (integer).
@: A separator.
xxxxxxx: A hexadecimal representation of the array's hash code, which is essentially a unique identifier for that specific array object in memory.
To print the actual elements of the array in a human-readable format, you would typically use Arrays.toString(): */

// to Prevent that  you would typically use Arrays.toString(): 
        int[] arr1= {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr1));
    }
    
}
