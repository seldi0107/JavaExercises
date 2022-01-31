public class ex44 {
    public static void main(String[] args) throws Exception {
        int nr = 274;
        int factor = LargestPrimeFactor(nr);
        System.out.println("The largest prime factor is" + factor);

    }
    public static int LargestPrimeFactor(int nr)
    {
        if(nr <= 1)
           return 0;
        else{
            int divider = 2;
            while(divider < nr)
            {
                if(nr % divider != 0)
                    divider++;
                else
                    nr = nr / divider;
            }
            return nr;
        }

        
    }
}
