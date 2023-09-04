package zerobase.weather.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//전역에 예외처리를 할때는 @RestControllerAdvice를 붙힌 클래스를 만들어서
//해당 클래스 안에 전역예외가 모이도록 설정을 한다
//전역예외가 모인것을 @ExceptionHandler가 해준다

@RestControllerAdvice // 전역에 예외처리
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)// 특정 컨트롤러 안에 만 예외처리
    public Exception handleAllException(){
        System.out.println("error from GlobalExceptionHandler");
        return new Exception();
    }
}
