public class Trie {

   public class TrieNode{
        TrieNode[] child;
        boolean eow;

        TrieNode() {
            child = new TrieNode[26]; //a to z
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            eow = false;
        }
    }

    public TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode  curr = root;

        for(int j=0;j< word.length();j++){
            int idx= word.charAt(j)-'a';
            if( curr.child[idx] == null){
                curr.child[idx] = new TrieNode();
            }
            if( j == word.length()-1){
                curr.child[idx].eow=true;
            }

             curr=curr.child[idx];
        }
        
    }
    
    public boolean search(String word) {
         TrieNode  curr = root;

        for(int j=0;j< word.length();j++){
            int idx= word.charAt(j)-'a';
            if( curr.child[idx] == null){
                return false;
            }
            if( j == word.length()-1 && curr.child[idx].eow==false){
               return false;
            }

             curr=curr.child[idx];
        }
        return true;
        
    }
    
    public boolean startsWith(String prefix) {
          TrieNode  curr = root;

        for(int j=0;j< prefix.length();j++){
            int idx= prefix.charAt(j)-'a';
            if( curr.child[idx] == null){
                return false;
            }
             curr=curr.child[idx];
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */