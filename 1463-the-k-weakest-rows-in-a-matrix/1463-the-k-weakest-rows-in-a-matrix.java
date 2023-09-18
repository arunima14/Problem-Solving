import java.util.*;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<mat.length; i++){
            int count = 1;
            for(int j=0; j<mat[i].length; j++)
                if(mat[i][j] == 1)
                    count++;

            map.put(i, count);
        }
        
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

		//sorting the list with a comparator
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		//convert sortedMap back to Map
		Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

        int[] result = new int[k];
        int i=0;

        for(Map.Entry<Integer, Integer> values : sortedMap.entrySet()){
            if(i == k)
                break;
            
            result[i++] = values.getKey();
        }

        return result;
    }
}