// 929. Unique Email Addresses
// Difficulty : Easy
// Comment : Harder than Easy! I thoght..
// url : https://leetcode.com/explore/interview/card/google/67/sql-2/3044/
import java.util.*;
class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> hs = new HashSet<>();
        for(String email : emails) {
            int idxAt = email.indexOf("@");
            String local = email.substring(0,idxAt);
            String domain = email.substring(idxAt,email.length());
            int idxPlus = local.indexOf("+");
            if(idxPlus!=-1) local = local.substring(0,idxPlus);
            local = local.replace(".","");
            hs.add(local+domain);
        }
        return hs.size();
    }
}
/*
class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> hs = new HashSet<>();
        for(String email : emails) {
            String[] tot = email.split("@");
            String local = tot[0];
            String domain = tot[1];
            
            local = local.split("\\+")[0];
            local = local.replace(".","");
            
            hs.add(local+"@"+domain);
            
        }
        return hs.size();
    }
}
*/