package com.example.demo.controller;
import com.example.demo.entity.Invitation;
import com.example.demo.service.invitationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import io.swagger.annotations.Api;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Api(tags = "论坛信息")
@Controller
public class LoginController {
	@Resource
    private invitationService books ;
	@ApiOperation(value = "用户信息查询" ,response = Invitation.class)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "查询", required = true, dataType = "int"),
			@ApiImplicitParam(name = "title", value = "查询标题", required = true, dataType = "String"),
			@ApiImplicitParam(name = "summary", value = "帖子摘要", required = true, dataType = "String"),
			@ApiImplicitParam(name = "author", value = "作者", required = true, dataType = "String"),
			@ApiImplicitParam(name = "createdate", value = "发布时间", required = true, dataType = "String")
	})

	@RequestMapping("select")	
	public ModelAndView list(Invitation user) {
		ModelAndView mav = new ModelAndView();	
		List<Invitation> ls = books.getUserList(user);
		mav.addObject("ls", ls);
		mav.setViewName("invit");
		return mav;	
		}


	

}
