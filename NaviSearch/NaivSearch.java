public class NaivSearch {
    public boolean search(String text, String pattern){
        boolean found = false;

        for(int i=0; i<text.length() - pattern.length(); i++){
            String subString = text.substring(i, i + pattern.length());
            if(subString.equals(pattern)){
                found = true;
            }
        }

        return found;
    }
}
