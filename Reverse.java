import java.util.Arrays;
public class Reverse
{
    public static void main(String[] args) {
        int[]arr={ 23, 34, 56, 78};
        for( int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
