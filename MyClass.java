class MyClass
{
    
    void operation()
    {
        int a = 10 , b = 20 ; 
        System.out.println("a==b : " +(a == b));
        System.out.println("bitwise and  : " +(a & b)) ;
        System.out.println("logical or : " +(true || false)); 
    }
    
    
    void prime_no()
    {
        int number = 34;
        int temp = 0; 
        for(int i = 1 ; i < 34 ; i++)
        {
            if(number % i == 0)
            {
                temp += 1;
            }
        }
        if(temp > 1)
        {
            System.out.println("It is a composite number");
        }
        else
        {
            System.out.println("It is a prime number");
        }
    }

    void leap_year()
    {
        int year = 2022; 
        if( year % 4 == 0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }

    void sum_of_10_numbers()
    {
        int a = 13;
        int sum = 0;  
        for(int i = 0; i < 10 ; i++)
        {
            sum = sum + a; 
        }
        System.out.println(sum); 
    }

    void switch_statement()
    {
        int a= 10 ; 
        switch(a)
        {   
            case 1:
                System.out.println("This is my case number 1 ");
                break;
            case 10 : 
                System.out.println("This is my case number 10");
                break; 
        }
    }

    public static void main(String args[])
    {
        MyClass obj = new MyClass();
        obj.operation();
        obj.prime_no();
        obj.leap_year(); 
        obj.sum_of_10_numbers(); 
        obj.switch_statement();  
    }
}