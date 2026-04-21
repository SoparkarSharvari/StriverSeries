package Trie;


    class TrieNode {
        boolean flag = false;
        TrieNode links[] = new TrieNode[26];

        // check if trie contains that letter
        boolean containsKey(char ch) {
            return (links[ch - 'a'] != null);
        }

        // get the node which is mapped to that letter
        TrieNode get(char ch) {
            return links[ch - 'a'];
        }

        // put that letter in trie
        void put(char ch) {
            links[ch - 'a'] = new TrieNode();
        }

        // set end of word
        void setEnd() {
            flag = true;
        }

        boolean isEnd() {
            return flag;
        }
    }

    class TrieBasic {
    void insertInTrie(TrieNode root, String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.containsKey(ch) == false) {
                node.put(ch);
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    boolean serachInTrie(TrieNode root, String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.containsKey(ch) == false) {
                return false;
            }
            node = node.get(ch);
        }
        return node.isEnd();
    }

    boolean startsWith(TrieNode root, String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.containsKey(ch) == false) {
                return false;
            }
            node = node.get(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        TrieBasic trie = new TrieBasic();
        TrieNode root = new TrieNode();
        trie.insertInTrie(root, "apple");
        System.out.println(trie.serachInTrie(root, "apple")); // true
        System.out.println(trie.serachInTrie(root, "abc")); // false
        System.out.println(trie.startsWith(root, "app")); // true
        System.out.println(trie.startsWith(root, "xyz")); // false
    }
}
