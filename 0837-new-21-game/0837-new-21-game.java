class Solution {
public double new21Game(int n, int k, int maxPts) {
if (k > n)
return 0;
if (k == 0 || k + maxPts <= n)
return 1;

    int steps = k + maxPts;

    List<Double> dp = new ArrayList<>(n + 1);
    for (int i = 0; i <= n; i++) {
        dp.add(0.0);
    }
    
    double ans = 0.0, cum = 1.0;

    dp.set(0, 1.0);
    for (int j = 1; j <= n; j++) {
        dp.set(j, cum / maxPts);
        if (j < k)
            cum += dp.get(j);
        if (j - maxPts >= 0)
            cum -= dp.get(j - maxPts);
    }
    
    for (int i = k; i <= n; i++)
        ans += dp.get(i);
    
    return ans;
}
}