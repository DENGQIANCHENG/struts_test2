package web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class LoginAction extends ActionSupport {
    private String userName;
    private String password;

    public void validate(){
        if(StringUtils.isEmpty(userName)){
            addFieldError("userName","用户名不能为空");
        }
        if(StringUtils.isEmpty(password)){
            addFieldError("password","密码不能为空");
        }
    }
    public String execute() throws Exception {
        if(userName.equals("admin")&&password.equals("123")){
            Map<String,Object> session = ActionContext.getContext().getSession();
            session.put("userName",userName);
            return "success";
        }
        return "error";
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
}
