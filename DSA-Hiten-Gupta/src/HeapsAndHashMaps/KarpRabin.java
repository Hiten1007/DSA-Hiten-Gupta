package HeapsAndHashMaps;

public class KarpRabin {
    private final int PRIME = 101;
    private double calculateHash(String s){
        double hash = 0;
        for(int i = 0; i < s.length(); i++){
            hash = hash + s.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength){
        double newHash = (prevHash - oldChar)/PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    public void search(String pattern, String text){
        int patternLength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0, patternLength));

        for(int i = 0; i <= text.length() - patternLength; i++){
            if(patternHash == textHash){
                if(text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern is found at index " + i);
                }
            }
            if(i < text.length() - patternLength){
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
    }
}

