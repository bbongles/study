package com.example.board.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LoggerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.debug("============================ START ============================");
        log.debug("Request URI \t: " + request.getRequestURI());

        return super.preHandle(request, response, handler);

    } // end preHandle()

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        log.debug("============================ END ============================");

        //super.postHandle(request, response, handler, modelAndView);

    } // end postHandle()

} // end class LoggerInterceptor
