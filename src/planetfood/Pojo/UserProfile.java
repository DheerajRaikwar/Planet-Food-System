
package planetfood.Pojo;


public class UserProfile {
    private static String Userid;
    private static String username;
    private static String usertype;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserProfile.username = username;
    }

    public static String getUsertype() {
        return usertype;
    }

    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }

    public static String getUserid() {
        return Userid;
    }

    public static void setUserid(String Userid) {
        UserProfile.Userid = Userid;
    }
    
    
}
