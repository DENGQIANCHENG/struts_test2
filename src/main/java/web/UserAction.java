package web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.User;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

public class UserAction extends ActionSupport{
    private String userName;
    private String password;
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
    //登录方法，该方法不允许拦截
    public String login(){
        if(userName.equals("admin") && password.equals("admin")){
//保存session
            ServletActionContext.getRequest().getSession().setAttribute("loginUser",userName);
            return SUCCESS;//成功
        }
        return LOGIN;//失败
    }
    //以下4个方法需要进行身份验证
//查询
    public String find(){
        return SUCCESS;
    }
    //添加
    public String add(){
        return SUCCESS;
    }
    //修改
    public String update(){
        return SUCCESS;
    }
    //删除
    public String delete(){
        return SUCCESS;
    }
}
//    private User user = new User();
//    public User getModel() {
//        return user;
//    }
//    //    private List<User> userList;
////
////    public String findList() throws Exception {
////        userList= new ArrayList<User>();
////        userList.add(new User(1,"张三",1,"12345678978"));
////        userList.add(new User(2,"李四",1,"12345678974"));
////        userList.add(new User(3,"王五",1,"12345678975"));
////        userList.add(new User(4,"刘六",1,"12345678977"));
////        userList.add(new User(5,"崔七",0,"12345678971"));
////
////        return SUCCESS;
////    }
////
////    public List<User> getUserList() {
////        return userList;
////    }
////
////    public void setUserList(List<User> userList) {
////        this.userList = userList;
////    }
//    public String login(){
//        return SUCCESS;
//    }public String register(){
//        return "register";
//    }
//    public String update(){
//        return SUCCESS;
//    }
//    public String delete(){
//        return SUCCESS;
//    }
//
//}
