package controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import utils.PageData;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: wangxindong
 * Date: 2017/3/7
 * Time: 22:45
 */
public class BaseController {

    public PageData getPageData() {
        return new PageData(getRequest());
    }

    public HttpServletRequest getRequest() {
        HttpServletRequest request =
                ((ServletRequestAttributes)
                        RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }
}
