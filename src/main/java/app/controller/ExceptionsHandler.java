package app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import app.model.util.ErrorDescription;

@ControllerAdvice
public class ExceptionsHandler {
    @ExceptionHandler
    @ResponseBody
    public ResponseEntity<ErrorDescription> handle(HttpServletRequest req, Exception e) {
        String errorURL = req.getRequestURL().toString();
        return new ResponseEntity<>(
            new ErrorDescription(
                errorURL,
                e.getMessage()
            ),
            HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}