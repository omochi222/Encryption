
public class Caesar {

    public String encrypt(String str, int key) {
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++) 
            chars[i] += key;

        return String.valueOf(chars);
    }

    public String decrypt(String str, int key) {
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++)
            chars[i] -= key;
        
        return String.valueOf(chars);
    }
}
