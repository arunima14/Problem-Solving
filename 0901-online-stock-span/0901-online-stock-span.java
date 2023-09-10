class Pair{
    int price;
    int span;
    Pair(int x, int y){
        price = x;
        span = y;
    }
}
class StockSpanner {
    ArrayDeque<Pair> stck;
    public StockSpanner() {
        stck = new ArrayDeque<>();
    }
    
    public int next(int pr) {
        int sp = 1;
        while(!stck.isEmpty() && pr >= stck.peek().price){
            sp += stck.pop().span;
        }
        stck.push(new Pair(pr, sp));
        return sp;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */