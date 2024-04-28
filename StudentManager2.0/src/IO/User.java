package IO;
import java.io.Serializable;
//实现可序列化接口
public class User implements Serializable {
//    固定序列号
    private static final long serialVersionUID= 1L;
    private String userName;
    private String password;
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        boolean flag=false;
        if(o instanceof User){
            User user = (User) o;
            if(user.userName.equals(this.userName)){
                flag=true;
            }
        }
        return flag;
    }
}
