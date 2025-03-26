//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    void segregateEvenOdd(int arr[]) {
    int left = 0, right = arr.length - 1;

        // Segregate even and odd numbers
        while (left < right) {
            while (left < arr.length && arr[left] % 2 == 0) {
                left++;
            }
            while (right >= 0 && arr[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                // Swap even and odd numbers
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // Sort the even part (from 0 to 'right' inclusive)
        Arrays.sort(arr, 0, right + 1);

        // Sort the odd part (from 'right + 1' to end)
        Arrays.sort(arr, right + 1, arr.length);
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            obj.segregateEvenOdd(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends