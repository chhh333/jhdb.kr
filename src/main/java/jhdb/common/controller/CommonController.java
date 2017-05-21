/********************************************************* 
 * 
 * 2017/05/21 ����° ����(Log4j)
 * jhdb.common.controller ��Ű�� ���� -> CommonController �ڹ� ���� ����
 * next step : �׽�Ʈ�뵵�� index.jsp ������ jsp �����带 /common/openSampleList.do�� ����
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
		log.debug("���ͼ��� �׽�Ʈ");
		
		return mv;
	}
}
