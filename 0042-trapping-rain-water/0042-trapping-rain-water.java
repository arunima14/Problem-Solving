class Solution {
    public int trap(int[] height) {
        if(height == null || height.length < 2)
            return 0;

        Stack<Integer> elevation = new Stack<>();
        int i=0, maxWater = 0;
        while(i < height.length){
            if(elevation.isEmpty() || height[i] <= height[elevation.peek()])
                elevation.push(i++);

            else{
                int top = elevation.pop();
                if(!elevation.isEmpty()){
                    int minHeight = (int)Math.min(height[elevation.peek()], height[i]);

                    maxWater += (minHeight - height[top]) * (i-elevation.peek()-1);
                }
            }
        }

        return maxWater;
    }
}