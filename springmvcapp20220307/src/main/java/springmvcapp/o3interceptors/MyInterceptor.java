package springmvcapp.o3interceptors;

import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		System.out.println("Requested URL : " + request.getRequestURL());
		HttpSession session = request.getSession();
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		if (userInfo == null) {
			session.setAttribute("userInfo", new UserInfo());
		}
		boolean isConnected = userInfo != null && userInfo.isConnected();

		if (isConnected || request.getRequestURI().contains("login")) {
			return true;
		} else {
// /springmvcapp/app/user
			String[] uriSplit = request.getRequestURI().split("/");
			if (uriSplit.length > 2) {
				String uriToRedirect = Stream.of(uriSplit).skip(2).reduce("", (s1, s2) -> s1 + "/" + s2) +"/";
				// /app/user
//				((UserInfo) session.getAttribute("userInfo")).setRedirect(uriToRedirect);
				response.sendRedirect(request.getContextPath() + "/app/login?redirect=" + uriToRedirect);
			} else {
			response.sendRedirect(request.getContextPath() + "/app/login");
			}
		}

		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
//		System.out.println("Handled URL : " + request.getRequestURL());
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
//		System.out.println("Viewed completed for URL : " + request.getRequestURL());
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
