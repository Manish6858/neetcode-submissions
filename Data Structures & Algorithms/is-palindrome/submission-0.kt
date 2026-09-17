class Solution {
    fun isPalindrome(s: String): Boolean {
        
        var newStr = ""
        for (i in s){
            if(i.isLetterOrDigit()){
                newStr += i.lowercaseChar()
            }
        }
        return newStr == newStr.reversed()
        

    }
}
