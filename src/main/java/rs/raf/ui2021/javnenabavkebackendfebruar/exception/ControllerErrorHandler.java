package rs.raf.ui2021.javnenabavkebackendfebruar.exception;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.google.gson.Gson;

@ControllerAdvice
public class ControllerErrorHandler {

    @ExceptionHandler(rs.raf.ui2021.javnenabavkebackendfebruar.exception.CustomException.class)
    public ResponseEntity<?> handleCustomException(rs.raf.ui2021.javnenabavkebackendfebruar.exception.CustomException exception) {

        rs.raf.ui2021.javnenabavkebackendfebruar.exception.Message message = new  rs.raf.ui2021.javnenabavkebackendfebruar.exception.Message(exception.getMessage());
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(message), exception.getHttpStatus());
    }
}