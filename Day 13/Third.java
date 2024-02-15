public class Third {

    public static boolean isAnagram(a,b){
        for ( int i = 0;i< a.length();i++){
            for(int j =0;j<a.lenth();j++){
            if ( a[i] != b[j])
            return flase;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        string a = "care";
        string b = "race";
        System.out.println(isAnagram(a,b));
       
    }
}
