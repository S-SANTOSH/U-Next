class MyClass_1
{
    public static void main(String args[])
    {
        int array[] = {2,3,1,5,5,6}; 
        System.out.println("Print all the values of array : ") ; 
        for(int i = 0 ; i < 6 ; i++)
        {
            System.out.print(array[i]+" "); 
        }
        System.out.println(); 
        System.out.println("Print all the values in reverse order");
        for(int j = 0 ; j < 6 ; j++ )
        {
            System.out.print(array[5 - j]+" ");
        }
        System.out.println(); 
        System.out.println("Print all the duplicate values") ; 
        for(int i = 0 ; i < 6; i++)
        {
            for(int j = 0 ; j < 6 ; j++)
            {
                if(array[i] == array[j] && i != j)
                {
                    System.out.print(array[i]+" "); 
                }
            }
        }
        System.out.println(); 
        System.out.println("Sort"); 
        for(int i = 0; i < 6 ; i++)
        {
            for(int j = 0 ; j < 6 ; j++)
            {
                if(array[i] < array[j])
                {
                    int temp; 
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < 6 ; i++)
        {
            System.out.print(array[i]+" "); 
        }
        System.out.println(); 
        System.out.println("Reverse the number ");
        int number = 123456; 
        int reverse= 0  ; 
        while(number != 0)
        {
            int reminder = number % 10 ; 
            number = number/10 ;
            reverse = reverse * 10 + reminder; 
        }
        System.out.println("The reverse value is : "+ reverse) ; 

    }
}