class jumpgame {
    public int jump(int[] nums) {
        int last = 0;
        int jump = 0;
        int reach = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (i == last) {
                jump++;
                last = reach;
            }
        }
        return jump;
        

    }
}
