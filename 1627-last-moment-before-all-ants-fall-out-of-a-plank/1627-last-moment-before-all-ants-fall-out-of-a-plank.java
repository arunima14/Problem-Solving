class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
    int units = 0;
    for (var unit : left)
        units = Math.max(units, unit);
    for (var unit : right)
        units = Math.max(units, n - unit);        
    return units;
}
}