import kotlin.reflect.KType
import kotlin.reflect.typeOf

fun main() {

    class Solution {

        fun searchInsert(nums: IntArray, target: Int): Int {
            val s = nums.size/2
            if(nums[s] == target){
                return s
            }
            else if (s == 0 && nums[s] > target)
                return 0
            else if (s==0 && nums[s]< target)
                return 1
            else if (nums[s] > target){
                return searchInsert(nums.copyOfRange(0,s),target)
            }else{
                return s + searchInsert(nums.copyOfRange(s,nums.size),target)
            }
        }

      /*  fun searchInsert(nums: IntArray, target: Int): Int {
            var start = 0
            var end = nums.size -1
            var mid = -1
            while ( (end - start)>1){
                 mid = (start + end)/2
                when {
                    target == nums[mid] -> return mid
                    target<nums[mid] -> {
                        end = mid
                    }
                    target>nums[mid] -> {
                        start = mid
                    }
                }
            }
            return when {
                target <= nums.get(start) -> start
                target > nums.get(end) -> end + 1
                else -> end
            }
        }*/
    }

    val res = Solution().searchInsert(listOf<Int>(1).toIntArray(),0)
    println(res)

}