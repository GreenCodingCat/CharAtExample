
package pkgchar.example;


public class CharExample {

    
    public static void main(String[] args) {
        
        String aWord = "Northridge Knights";
        
        for(int i=0; i < aWord.length(); i++){
            System.out.println(aWord.charAt(i));
        }
        
        System.out.println(aWord.charAt(4));

        
        System.out.println(aWord.length());
        
    }
    
}
