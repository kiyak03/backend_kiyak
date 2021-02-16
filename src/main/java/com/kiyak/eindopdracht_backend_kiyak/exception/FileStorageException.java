package com.kiyak.eindopdracht_backend_kiyak.exception;

import com.kiyak.eindopdracht_backend_kiyak.payload.response.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class FileStorageException extends RuntimeException {

    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class MyFileNotFoundException extends RuntimeException {
        public MyFileNotFoundException(String message) {
            super(message);
        }

        public MyFileNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

//    private static final long serialVersionUID = 1L;
//    private String msg;
//
//    public FileStorageException(String msg) {
//        this.msg = msg;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//}

//public class FileStorageException extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler(MaxUploadSizeExceededException.class)
//    public ResponseEntity<MessageResponse> handleMaxSizeException(MaxUploadSizeExceededException exc) {
//        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse("Max. file size is 2MB!"));
//    }
//}
