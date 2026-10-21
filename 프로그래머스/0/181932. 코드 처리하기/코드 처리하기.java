class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int idx=0;idx<code.length();idx++) {
            if(code.charAt(idx) == '1') {
                mode = mode == 1 ? 0 : 1;
            } else {
                switch (mode) {
                    case 0 :
                        if(idx%2!=1) {
                            ret += code.charAt(idx);
                        }
                        break;
                    case 1 :
                        if(idx%2==1) {
                            ret += code.charAt(idx);
                        }
                        break;
                }
            }
        }
        
        if (ret.isEmpty()) {
            ret = "EMPTY";
        }
        
//         StringBuilder answer = new StringBuilder();
        
//         for(int idx=0;idx<code.length();idx++) {
//             char cidx = code.charAt(idx);
//             if(cidx=='1') {
//                 mode = mode==0 ? 1 : 0;
//                 continue;
//             }
//             if(idx%2==mode) {
//                 answer.append(cidx);
//             }
//         }
        
//         ret = answer.length() == 0 ? "EMPTY" : answer.toString();
        
        return ret;
    }
}