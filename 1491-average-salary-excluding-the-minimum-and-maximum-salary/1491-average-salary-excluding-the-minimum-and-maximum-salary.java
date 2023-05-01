class Solution {
    public double average(int[] salary) {
        double min = salary[0];
        double max = salary[0];
        double sum = 0.0;
        
        //finding min and max salary and calaculating sum of salaries
        for(int i=0; i<salary.length; i++){
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary[i];
        }
        
        sum = sum - min - max;
        double avg = sum/(salary.length-2);
        
        return avg;
    }
}