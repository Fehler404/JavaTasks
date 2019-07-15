class LargestNumber
{
    public static void main(String args[])
    {
        int[] a = new int[50];
        for(int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 10);
        }

        int max = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }

        System.out.println("The Given Array Element is:");
        for(int i = 0; i < a.length;i++)
        {
           if(i != (a.length - 1)){
               System.out.print(a[i] + ", ");
           }
           else{
               System.out.println(a[i] + ".");
           }

        }

        System.out.println("The largest number:" + max);
    }
}
