package com.czm.Interceptor;

import com.czm.model.UserEntity;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String url= httpServletRequest.getRequestURI();
        /*只对personalPage拦截*/
        if(url.indexOf("/personalPage")>=0){
            HttpSession httpSession= httpServletRequest.getSession();
            UserEntity userEntity=(UserEntity)httpSession.getAttribute("user");
            if(userEntity!=null){
                return true;
            }
            else{
                httpServletResponse.sendRedirect("/login");
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
