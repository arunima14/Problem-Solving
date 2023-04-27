class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n); 
//         if(n<2)
//             return n;
        
//         boolean[] light = new boolean[n];
        
//         //round 1: all bulbs on
//         for(int j=0; j<n; j++){
//             light[j] = true;
//         }
        
//         //starting from second round till nth round
//         int i=1;
//         while(i<n){
//             int index = 0;
//             for(index = 0; index<n-i; index+=i+1){
//                 if(light[index+i])
//                     light[index+i] = false;
//                 else
//                     light[index+i] = true;
//             }
//             i++;
//         }
        
//         int count = 0;
//         for(i=0; i<n; i++){
//             if(light[i])
//                 count++;
//         }
        
//         return count;
    }
}