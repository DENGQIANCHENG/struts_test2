package web;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
    private String userName;

    public String execute() throws Exception {
        System.out.println("userName:"+userName);
        return "success";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
