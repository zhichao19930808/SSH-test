package xin.zcglory.action;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	protected ServletContext application;
	protected PrintWriter out;
	
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
		this.session = request.getSession();
		this.application = this.request.getServletContext();
	}
	public void setServletResponse(HttpServletResponse arg0) {
		try {
			this.response = arg0;
			this.out = this.response.getWriter();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
