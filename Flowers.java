public class Flower {
    
    public boolean flowerBed(int[] flowers, int n)
    {
        int count = 0;
        for(int i = 0; i < flowers.length; i++)
        {
            if(i == 0)//edge case beginning
            {
                if(flowers[i]==0 && flowers[i+1]==0)
                {
                    count++;
                }
            }
            else if(i == flowers.length-1)//edge case end
            {
                if(flowers[i]==0 && flowers[i-1]==0)
                {
                    count++;
                }
            }
            else//all middle cases
            {
                if(flowers[i-1]==0 && flowers[i]==0 && flowers[i+1]==0)
                {
                    count++;
                }
            }
        }
        
        if(count >= n)
            return true;
        else
            return false;
    }
}
