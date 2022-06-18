public class TimeComplexityDemo
{
    public static void main(String[] args)
    {
        double now = System.currentTimeMillis(); //storing a current time in variable now

        TimeComplexityDemo demo = new TimeComplexityDemo(); //creating object of demo 

        System.out.println(demo.findSum(66666));

        System.out.println("Time Taken-" + (System.currentTimeMillis() - now)+ " Millisec");

    }
        //Algorithm
    public int findSum(int n)
    {
        return n*(n+1)/2; //sum of natural numbers
    }
    
    // public int findSum(int n)
    // {
    //     int sum = 0;
    //     for(int i = 1; i<=n; i++)
    //     {
    //         sum = sum + i;
    //     }

    //     return sum;
    // }
}
