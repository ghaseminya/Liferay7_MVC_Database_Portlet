package ir.mnm.liferay.spring;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import ir.mnm.liferay.model.Bill;
import ir.mnm.liferay.util.db;
import ir.mnm.liferay.service.HelloService;
import ir.mnm.liferay.util.LiferayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.exception.PortalException;
import ir.mnm.liferay.model.User;

import java.util.List;

@Controller("liferay7-springmvc-portlet")
@RequestMapping("view")
public class HelloController {

    @Autowired
    private HelloService service;
    
    @RenderMapping
    public ModelAndView handleRenderRequest(RenderRequest request, RenderResponse response) throws PortalException {
        db d=new db();
        User user = LiferayUtil.getCurrentUser(request);
        List<Bill> blist=d.getBills(user.getEmail());
        service.sayHelloToTheLogs(user);

        ModelAndView model = new ModelAndView("view");
        model.addObject("user", user);
        model.addObject("blist", blist);
        return model;
    }
}
