package packt.book.jee_eclipse.book.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="loginBean")
@RequestScoped


public class LoginBean {
	
	
	
	
	private String userName ; 
	private String password ;
	private String errMsg;
	
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
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
	
	public String validate() {
		if("admin".equals(userName) && "admin".equals(password)) {
			errMsg = null ; 
			
			return "welcome"; 
		}
		else
		{
			errMsg = "Invalid user id or password. Please try again";
					return null;

		}
	}
	
	
	
}
