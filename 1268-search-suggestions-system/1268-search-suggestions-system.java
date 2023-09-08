class TrieNode{
    boolean isEndOfWord = false;
    TrieNode[] children = new TrieNode[26];
}
class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur = root;
        for(char c: word.toCharArray()){
            if(cur.children[c-'a'] == null){
                cur.children[c-'a'] = new TrieNode();
            }
            cur = cur.children[c-'a'];
        }
        cur.isEndOfWord = true;        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(char c: prefix.toCharArray()){
            if(temp.children[c-'a'] ==null)
                return false;
            temp = temp.children[c-'a'];
        }
        return true;
    }
}

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        Trie trie = new Trie();
        for(String product: products)
            trie.insert(product);
        
        List<List<String>> ans = new ArrayList<List<String>>();
        for(int i=0; i<searchWord.length(); i++){
            if(trie.startsWith(searchWord.substring(0,i+1))){
                List<String> list = new ArrayList<>();
                for(String product: products){
                    if(product.startsWith(searchWord.substring(0,i+1))){
                        if(list.size()!=3)
                            list.add(product);
                        else
                            break;
                    }
                }
                ans.add(list);
            }else{
                ans.add(new ArrayList<>());
            }
        }
        return ans;
    }
}