class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int m) {
        int n=customers.length;
        int tot=0,max=0,maxIndex=0;;
        for(int i=0;i<n;i++)
        {
            if(grumpy[i]==0)
            {
                tot=tot+customers[i];
                customers[i]=0;
            }
        }
       
        int res=0;
        for(int i=0;i<=n-m;i++)
        {
            int sum=0;
            for(int j=i;j<i+m;j++)
            {
                sum=sum+customers[j];
                
            }
            res=Math.max(res,sum);
        }
        tot=tot+res;
        return tot;
    }
}
