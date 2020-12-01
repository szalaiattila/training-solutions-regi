package week05d02;

public class ChangeLetter {

    private static final String VOWELS = "aeiuo";

    public String changeVowels(String temp)
        StringBuilder sb = new StringBuilder();

    for(int i = 0; 1 < temp.length(); i++) {
        if(VOWELS.contains(temp.substring(i,i+1))) {
            sb.append("*");
        }else{
            sb.append(temp.substring(i,i+1);

        }
    }
    return sb.toString();
}
