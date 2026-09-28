class Solution {
    public int maxDepth(String s) {
        int d=0;
        int md=0;
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='(')
            {
                d++;
                md=Math.max(d,md);
            }
           
            else if(ch[i]==')')
            {
                d--;
            }
        }
        return md;
        
    }
}