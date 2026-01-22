class Cryptography
{
    public void shiftDisplay(String[] arr , int shiftCount)
    {
        String[] array  = new String[arr.length];
        
        System.out.println("Shifted Alphabets : ");
        for(int i = 0; i <= arr.length - 1  ; i++)
        {  
            if(i == arr.length - 1)
                array[i] = arr[0];
            else
                array[i] = arr[i + 1];
                
            System.out.print(array[i] + " ");
           
        }
          System.out.println("");
    }
    public String encryption(String message , int shiftCount )
    {
        return "Encryption";
    }
     public String decryption(String message , int shiftCount )
    {
        return "Decryption";
    }

    
}
public class cipher {
    public static void main(String[] args)
    {
        String alphabets[]  = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        System.out.println("This is original alphebets");

    
        for( int i = 0; i <= alphabets.length - 1; i++)
        { 
            System.out.print(alphabets[i] + " ");
        }

          System.out.println("");
        Cryptography newAlphbets = new Cryptography();
        newAlphbets.shiftDisplay(alphabets,0 );
    }
}
