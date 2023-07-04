class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        if(numRows == 1){
            list.add(new ArrayList<Integer>(Arrays.asList(1)));
        }else if(numRows == 2){
            list.add(new ArrayList<Integer>(Arrays.asList(1)));
            list.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        }else{
            list.add(new ArrayList<Integer>(Arrays.asList(1)));
            list.add(new ArrayList<Integer>(Arrays.asList(1,1)));
            
            for(int i=2; i<numRows; i++){
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
        }
        }
        
        return list;
    }
}