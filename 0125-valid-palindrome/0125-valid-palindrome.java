class Solution {
    public boolean isPalindrome(String s) {
         String rev = "";
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); 
        for(int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
         




















































         
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna