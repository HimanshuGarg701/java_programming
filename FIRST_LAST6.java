/*Given an array of ints, return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.


firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
*/
package school;


public class FIRST_LAST6 {
    public static void main(String[] args){
        int[] answer = {1,2,6};
        boolean num = firstLast6(answer);
        System.out.println(num);
    }
    
    public static boolean firstLast6(int[] nums) {
        int len = nums.length;
            for(int i=0; i<len; i++){
    
                if(nums[0]==6 || nums[len-1]==6){
                    return true;
                }
            }return false;
}

}
