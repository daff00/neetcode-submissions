class Solution {
    public void rotate(int[] nums, int k) {
        int[] tempArr = nums.clone();
        int[] answer = new int[tempArr.length];

        // Temp value initialization
        int tempLast;

        // Check array length and k
        if (nums.length == 0) {
            return;
        }

        if (0 <= k && k <= 100000) {
            k = k % nums.length;

            for (int i = 0; i < k; i++) {
                tempLast = tempArr[tempArr.length - 1];

                for (int j = 0; j < nums.length; j++) {
                    if (j != (nums.length - 1)) {
                        answer[j + 1] = tempArr[j];
                    } else {
                        answer[0] = tempLast;
                    }
                }

                tempArr = answer.clone();
            }

            // Copy answer into original nums array
            for (int i = 0; i < nums.length; i++) {
                nums[i] = tempArr[i];
            }

        } else {
            System.out.println("K Must not be a negative number or more than 100000");
        }
    }
}