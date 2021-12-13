package com.atguigu.crowd.mvc.config;


import com.atguigu.crowd.constant.CrowdConstant;
import com.atguigu.crowd.exception.LoginAcctAlreadyInUseException;
import com.atguigu.crowd.exception.LoginAcctAlreadyInUseForUpdateException;
import com.atguigu.crowd.exception.LoginFailedException;
import com.atguigu.crowd.util.CrowdUtil;
import com.atguigu.crowd.util.ResultEntity;
import com.google.gson.Gson;
import com.mysql.cj.log.Log;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zehao
 * @create 2021-11-04-17:21
 */
//@ControllerAdvice表示当前类是一个基于注解的异常处理器类
@ControllerAdvice
public class CrowdExceptionResolver {

    @ExceptionHandler(value = LoginAcctAlreadyInUseForUpdateException.class)
    public ModelAndView resolveLoginAcctAlreadyInUseForUpdateException(
            LoginAcctAlreadyInUseForUpdateException exception,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        String viewName = "system-error";
        return commonResolver(viewName,exception,request,response);
    }

    @ExceptionHandler(value = LoginAcctAlreadyInUseException.class)
    public ModelAndView resolveLoginAcctAlreadyInUseException(
            LoginAcctAlreadyInUseException exception,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        String viewName = "admin-add";
        return commonResolver(viewName,exception,request,response);
    }


    @ExceptionHandler(value = LoginFailedException.class)
    public ModelAndView resolveLoginFailedException(
            LoginFailedException exception,
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        String viewName = "admin-login";
        return commonResolver(viewName,exception,request,response);
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public ModelAndView resolveMathException(ArithmeticException exception,HttpServletRequest request,HttpServletResponse response) throws IOException {
        String viewName = "system-error";
        return commonResolver(viewName,exception,request,response);
    }


    //@ExceptionHandler将一个具体的异常类型和一个方法关联起来
    @ExceptionHandler(value = Exception.class)
    public ModelAndView resolveException(
            // 实际捕获到的异常类型
            Exception exception,
            // 当前请求对象
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        String viewName = "system-error";
        return commonResolver(viewName,exception,request,response);
    }

    private ModelAndView commonResolver(
            // 异常处理完成后要去的错误页面
            String viewName,
            Exception exception,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {

            //1 判断请求的类型
            boolean judgeRequest = CrowdUtil.judgeRequestType(request);

            //2 如果是Ajax请求
            if (judgeRequest){
                //3 创建ResultEntity对象
                ResultEntity<Object> resultEntity = ResultEntity.failed(exception.getMessage());
                //4. 创建Gson对象
                Gson gson = new Gson();
                //5. 将ResultEntity对象转换为JSON字符串
                String json = gson.toJson(resultEntity);
                //6. 将JSON字符串作为响应体
                response.getWriter().write(json);
                //7. 由于上面已经通过原生的response对象返回了响应，所以不提供ModelAndView对象
                return null;
            }

            //8. 如果不是Ajax请求，则先创建ModelAndView对象
            ModelAndView modelAndView = new ModelAndView();
            //9. 将Exception对象存入模型中并返回
            modelAndView.addObject(CrowdConstant.ATTR_NAME_EXCEPTION,exception);
            //10. 设置对应的视图名称
            modelAndView.setViewName(viewName);

            //11. 返回
            return modelAndView;
    }

}