class UndergroundSystem {
    Map<Integer,Node> info;
    Map<String ,List<Double>> result;

    public UndergroundSystem() {
        info = new HashMap<>();
        result = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        Node n = new Node(stationName,t);
        info.put(id,n);
    }
    
    public void checkOut(int id, String stationName, int t) {
        Node n = info.get(id);
        String key = n.station+stationName+n.station;
        if(result.containsKey(key)){
            result.get(key).add(Double.valueOf(t-n.time));
        }
        else{
            List<Double> list = new ArrayList<>();
            list.add(Double.valueOf(t-n.time));
            result.put(key,list);
        }
        info.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        List<Double> list = result.get(startStation+endStation+startStation);
        double res=0;
        for(double i:list)
            res+=i;
        return res/list.size();
    }
}

class Node {
    public String station;
    public int time;
    public Node(String station,int time){
        this.station = station;
        this.time = time;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
