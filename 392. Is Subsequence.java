class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean sub = false;
        int i = 0;
        int j = 0;
        int sub_f = 0;
        if(s.length() == 0)
            return true;
        if (t.length() == 0)
        return false;
        for(i = 0; i < s.length(); i++)
        {
            for(j = sub_f; j < t.length(); j++)
            {
                if(t.charAt(j) == s.charAt(i))
                {
                    sub_f = j+1;
                    sub = true;
                    break;
                }
                else
                    sub = false;
            }
            if(sub == false)
                break;
            if(j == (t.length()-1) && i != (s.length()-1))
                return false;
        }
        return sub;
    }
}