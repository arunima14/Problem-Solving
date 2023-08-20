class Allocator {
    
    private int[] memory;

    public Allocator(int n) {
        memory = new int[n];
    }
    
    public int allocate(int size, int mID) {
        int cnt = 0; 
        for (int i = 0; i < memory.length; ++i) {
            if (memory[i] == 0) {
                if (++cnt == size) {
                    for (int j = i; j>= i-size+1; --j) 
                        memory[j] = mID; 
                    return i-size+1; 
                }
            } else cnt = 0; 
        }
        
        return -1;        
    }
    
    public int free(int mID) {
        int count = 0;
        for(int i=0; i<memory.length; i++){
            if(memory[i] == mID){
                count++;
                memory[i] = 0;
            }
        }
        
        return count;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.free(mID);
 */