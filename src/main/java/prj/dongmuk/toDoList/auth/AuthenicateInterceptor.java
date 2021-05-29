package prj.dongmuk.toDoList.auth;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//로그인 확인을 위한 인터셉터
@Log4j2
public class AuthenicateInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        if(request.getSession().getAttribute("user")==null){
            return false;
        }
        return true;
    }

}
