class Solution {
    public int maximum69Number (int num) {
        String st=String.valueOf(num);
        char []arr=st.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='6')
            {
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));

        
    }
}