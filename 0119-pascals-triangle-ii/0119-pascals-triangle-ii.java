class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(rowIndex == 0){
            return (new ArrayList<Integer>(Arrays.asList(1)));
        }
        else if(rowIndex == 1){
            return (new ArrayList<Integer>(Arrays.asList(1,1)));
        } else{
            
            list.add(new ArrayList<Integer>(Arrays.asList(1)));
            list.add(new ArrayList<Integer>(Arrays.asList(1,1)));
            
            for(int i=2; i<=rowIndex; i++){
                ArrayList<Integer> pascalsTriangleRow = new ArrayList<>();
                for(int j=0; j<=i; j++){
                    if(j==0 || j==i){
                        pascalsTriangleRow.add(1);
                    }
                    else{
                        //get elements from row above
                        pascalsTriangleRow.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                    }
                }
                list.add(new ArrayList<Integer>(pascalsTriangleRow));
                if(i == rowIndex)
                    return (new ArrayList<Integer>(pascalsTriangleRow));
            }
        }
        
        return (list.get(rowIndex));
    }
}