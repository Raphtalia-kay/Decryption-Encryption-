class Cryptography
{
    String alphabets[]  = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    public void shiftDisplay( int shiftCount)
    {
        String[] array  = new String[alphabets.length];
        
        System.out.println("Shifted Alphabets : ");
        for(int i = 0; i <= alphabets.length - 1  ; i++)
        {  
            if(i == alphabets.length - 1)
                array[i] = alphabets[0];
            else
                array[i] = alphabets[i + 1];
                
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
       
        Cryptography newAlphbets = new Cryptography();
        System.out.println("This is original alphebets");

        for( int i = 0; i <= newAlphbets.alphabets.length - 1; i++)
        { 
           System.out.print(newAlphbets.alphabets[i] + " ");
        }
        System.out.println("");
        
        newAlphbets.shiftDisplay(0 );
    }
}
