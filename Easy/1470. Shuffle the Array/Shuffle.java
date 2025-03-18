public class Shuffle {
  
    public int[] shuffle(int[] nums, int n) {
        
        int c=nums.length;
        int[] nums1=new int[c];
        int k=n;
        int j=0;
        for (int i = 0; i < 2 * n; i += 2) { 
          nums1[i] = nums[j++];   // Take from first half
          nums1[i + 1] = nums[k++]; // Take from second half
      }
        return nums1;
    }

  
  public static void main(String[] args) {
    int arr[]={1,1,2,2};
    int n=2;
    Shuffle ob=new Shuffle();
    int[] arr1=new int[arr.length];
    arr1=ob.shuffle(arr,n);
    System.out.println("Suffled Array");
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i]+" ");
    }
  }
}
