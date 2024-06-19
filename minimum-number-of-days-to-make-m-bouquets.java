class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int mid=-1;
        if((long)m*k>bloomDay.length) return mid;
        
        int min=Arrays.stream(bloomDay)
                        .min()
                        .getAsInt();
        int max=Arrays.stream(bloomDay)
                        .max()
                        .getAsInt();;
        while(min<max)
        {
            mid=min+((max-min)/2);
            if(isPossible(bloomDay,m,k,mid))
            {
                max=mid;
            }
            else
            {
                min=mid+1;
            }
        }
        return min;
    }
    public boolean isPossible(int[] bloomDay,int m,int k,int mid)
    {
          int bc=0;
          int adj=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=mid)
            {
                adj++;
                if(adj==k)
                {
                    bc++;
                    if(bc==m)
                    {
                        return true;
                    }
                    adj=0;
                }
            }
            else
            {
                adj=0;
            }
        }
        return false;
    }
}
