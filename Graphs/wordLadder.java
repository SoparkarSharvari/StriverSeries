import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class wordLadder {
    
    public static void main (String[] args){
        String start = "hit";
        String end = "cog";
        String[] wordList = {"hot","dot","dog","lot","log","cog"};
        int ans = ladderLength(start,end,wordList);
        System.out.println("The length of the shortest transformation sequence is : " + ans);
    }

    // Make Pair static and remove generics
    static class Pair {
        String word;
        int step;

        public Pair(String word, int step){
            this.word = word;
            this.step = step;
        }
    }
    
    public static int ladderLength(String start , String target, String[] wordlist){
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(start, 1));

        Set<String> set = new HashSet<>(Arrays.asList(wordlist));

        // Optional optimization: if target not present, return 0
        if(!set.contains(target)) return 0;

        while(!que.isEmpty()){  
            Pair pair = que.poll();
            String word = pair.word;
            int step = pair.step;

            if(word.equals(target)){
                return step;
            }

            for(int i = 0; i < word.length(); i++){
                for(char ch = 'a'; ch <= 'z'; ch++){
                    char[] replacedword = word.toCharArray();
                    replacedword[i] = ch;
                    String newword = new String(replacedword);

                    if(set.contains(newword)){
                        set.remove(newword); // mark visited
                        que.add(new Pair(newword, step + 1));
                    }
                }
            }
        }
         
        return 0;
    }
}