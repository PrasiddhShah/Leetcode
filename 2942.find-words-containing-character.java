class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> count = new ArrayList<>();
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].contains(String.valueOf(x)))
            {
                count.add(i);
            }
        }
        return count;
    }
}