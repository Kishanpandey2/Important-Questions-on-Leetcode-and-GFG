


class Solution {
    static String xor(char a,char b){
        return (a==b)?"0":"1" ;
    }
    static String flip(char a){
        return (a=='1')?"0":"1" ;
    }
    static String binToGrey(String B) {
        String gray = "" ;
        gray += B.charAt(0) ;
        for(int i = 1;i<B.length() ;i++){
            gray += xor(B.charAt(i-1),B.charAt(i)) ;
        }
        return gray ;
    }
    static String greyToBin(String G) {
        String binary = "" ;
        binary += G.charAt(0) ;
        for(int i = 1 ;i<G.length() ;i++){
            if(G.charAt(i)=='0')
            binary += binary.charAt(i-1) ;
            else
            binary += flip(binary.charAt(i-1)) ;
        }
        return binary ;
    }
};
