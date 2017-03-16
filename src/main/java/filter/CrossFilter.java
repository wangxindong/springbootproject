package filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 解决跨域问题
 * Created with IntelliJ IDEA.
 * User: wangxindong
 * Date: 2017/3/16
 * Time: 21:37
 */
public class CrossFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        if ("POST".equals(httpServletRequest.getMethod())) {
            HttpServletResponse rps = (HttpServletResponse) httpServletResponse;
            rps.setHeader("Access-Control-Allow-Origin", "*");
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
