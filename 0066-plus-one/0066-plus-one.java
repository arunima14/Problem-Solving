class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 1){
            digits[0] += 1;
            
            if(digits[0] > 9)
                return new int[] {1, digits[0]-10};
            
            return digits;
        }
        
        int lastIndex = digits.length - 1;
        digits[lastIndex] += 1;
        
        while(digits[lastIndex] > 9){
            if(lastIndex == 0){
                return DealWithLen1(digits);
            }
            digits[lastIndex] = digits[lastIndex] - 10;
            digits[lastIndex - 1] += 1;
            lastIndex--;
        }
        
        return digits;
    }
    
    int[] DealWithLen1(int[] digits){
            // digits[0] += 1;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<digits.length; i++)
            list.add(digits[i]);
        if(digits[0] > 9){
            list.set(0, list.get(0)-10);
            list.add(0, 1);
            
            int[] res = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                res[i] = list.get(i);
            }
            return res;
        }

        return digits;
    }
}