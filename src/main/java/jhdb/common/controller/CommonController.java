/********************************************************* 
 * 
 * 2017/05/21 세번째 세팅(Log4j)
 * jhdb.common.controller 패키지 생성 -> CommonController 자바 파일 생성
 * next step : 테스트용도임 index.jsp 파일의 jsp 포워드를 /common/openSampleList.do로 변경
 * 
 *********************************************************/
package jhdb.common.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
	Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/common/openSampleList.do")
	public ModelAndView openSampleList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("");
		log.debug("인터셉터 테스트");
		
		return mv;
	}
}
