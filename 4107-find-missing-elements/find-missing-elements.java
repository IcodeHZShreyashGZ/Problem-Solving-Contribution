import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missingList = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }
        
        Set<Integer> existingNums = new HashSet<>();
        for (int num : nums) {
            existingNums.add(num);
        }
        
        int[] numbers = IntStream.rangeClosed(min, max).toArray();
        
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i]; 
            
            if (!existingNums.contains(currentNumber)) {
                missingList.add(currentNumber);
            }
        }
        
        return missingList;
    }
}