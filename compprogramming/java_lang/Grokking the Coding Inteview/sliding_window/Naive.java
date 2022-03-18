import java.util.Arrays;

class AverageOfSubarrayOfSizeK {
  public static double[] findAverages(int K, int[] arr) {
    double[] result = new double[arr.length - K + 1];
    //the window has size = K
    //i,j : position
    //K, arr.length: range
    for(int i = 0; i<=arr.length -K; i++){//windows iterrating in arr.length -K  (4)
                                            //<= because the window iterates through all 4 elements
        double sum = 0;
        for(int j = i ; j < i+ K;j++){//within a window, at pos 0, j loops from 0 -> K, at pos i, j loops from i -> i + K
                                    // < because j iterates like in a normal array, which starts at 0
            sum +=arr[j];
        }
        result[i] = sum/K;
    }
    return result;

    
  }

  public static void main(String[] args) {
    double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
    System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
  }
}