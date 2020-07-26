class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        double avg = 0;
        for(int i=0;i<salary.length;i++)
        {
            if(min>salary[i])
            {
                min = salary[i];
            }
            if(max<salary[i])
            {
                max = salary[i];
            }
            
        avg = avg + salary[i];
        }
        avg = (avg-min-max)/(salary.length -2);
        return avg;
    }
}
