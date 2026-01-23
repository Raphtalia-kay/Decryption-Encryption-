class Cryptography
{
    String alphabets[]  = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    public String[] shiftDisplay( int shiftCount)
    {
        String[] array  = new String[alphabets.length];
        
        System.out.println("Shifted Alphabets : " + shiftCount);
        for(int i = 0; i <= alphabets.length - 1  ; i++)
        {  
            if (i + shiftCount < alphabets.length)
                {
                    array[i] = alphabets[i + shiftCount];
                    
                }
            else 
                    array[i] = alphabets[(i+shiftCount) - alphabets.length];
           
            System.out.print(array[i] + " ");
        }
        
          System.out.println("");
        return array;
    }
    public String encryption(String message , int shiftCount )
    {
        System.out.println();

        String[] shiftedArray = this.shiftDisplay(shiftCount);

        String[] messageArray = message.toLowerCase().split("");


        String[] updateMessageArray = new String[messageArray.length];

        
        for( int i = 0 ; i <= messageArray.length - 1 ; i++)
        {
            String letter = messageArray[i];

            for(int j = 0 ; j <= alphabets.length - 1 ; j++ ){
                if( alphabets[j].equals(letter))
                 updateMessageArray[i]  = shiftedArray[j];
                else if (letter.equals(" ") || letter.equals("'") || letter.equals(":") || letter.equals(".") || letter.equals(",") || letter.equals(";") || letter.equals("?") ||  letter.equals("!"))
                 updateMessageArray[i]  =  letter;
            }
                
        }
        String updateMessage = String.join("", updateMessageArray);
        System.out.println("here update -> " + updateMessage);
        return updateMessage; 
    }
    public String decryption(String message , int shiftCount )
    {
        System.out.println();

        String[] shiftedArray = this.shiftDisplay(shiftCount);

        String[] messageArray = message.toLowerCase().split("");

        String[] updateMessageArray = new String[messageArray.length];

        
        for( int i = 0 ; i <= messageArray.length - 1 ; i++)
        {
            String letter = messageArray[i];

            for(int j = 0 ; j <= shiftedArray.length - 1 ; j++ ){
                if( shiftedArray[j].equals(letter))
                 updateMessageArray[i]  = alphabets[j];
                else if (letter.equals(" ") || letter.equals("'") || letter.equals(":") || letter.equals(".") || letter.equals(",") || letter.equals(";") || letter.equals("?") ||  letter.equals("!"))
                    // System.out.println("space");
                    updateMessageArray[i]  =  letter;

            }
                
        }
        String updateMessage = String.join("", updateMessageArray);
        System.out.println("");
        System.out.println("here update -> " + updateMessage);
        
        
        return updateMessage; 
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
        // newAlphbets.shiftDisplay(3 );
       

        // newAlphbets.encryption("Hello!", 5);
        for(int i = 1; i < 26 ; i++)
        {
            newAlphbets.decryption("Kpk nfyl huk nptisl pu aol dhil:", i);

        }
        
        
        

    }
}
