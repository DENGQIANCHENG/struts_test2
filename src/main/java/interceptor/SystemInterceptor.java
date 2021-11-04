package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class SystemInterceptor extends MethodFilterInterceptor {
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        if(session.getAttribute("loginUser")==null){
            return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }
}
