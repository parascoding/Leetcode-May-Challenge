class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        char ch[]=J.toCharArray();
        for(int i=0;i<J.length();i++)
            hm.put(ch[i],1);
        ch=S.toCharArray();
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            if(hm.containsKey(ch[i]))
            count++;
        }
        return count;
        }
}