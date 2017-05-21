/********************************************************* 
 * 
 * 2017/05/21 세번째 세팅(Log4j)
 * com.jhdb.logger 패키지 생성 -> LoggerInterceptor 자바파일 생성
 * 아래 로그 시작과 끝을 알리는 소스 작성
 * next step : action-servlet.xml 파일 수정
 * 
 *********************************************************/


package jhdb.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerInterceptor extends HandlerInterceptorAdapter{
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if(log.isDebugEnabled()) {
			log.debug("=============================== START ===============================");
			log.debug(" Request URI \t : " + request.getRequestURI());
		}	
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		if(log.isDebugEnabled()) {
			log.debug("=============================== E N D ===============================");
		}
	}
}