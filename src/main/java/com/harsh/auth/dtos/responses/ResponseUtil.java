package com.harsh.auth.dtos.responses;

import com.harsh.auth.enums.ErrorCode;

import java.util.List;

public class ResponseUtil {
    public static <T> ApiResponse<T> success(T data, String message, String path) {
        return ApiResponse.<T>builder()
                .success(true)
                .message(message)
                .data(data)
//                TODO
                .traceId("TODO")
                .path(path)
                .build();
    }
    public static <T> ApiResponse<T> error(List<String> errors, String message, ErrorCode errorCode, String path) {
        return ApiResponse.<T>builder()
                .success(false)
                .message(message)
                .errors(errors)
                .errorCode(errorCode)
                .path(path)
                .build();
    }
    public static <T> ApiResponse<T> error(String error, String message, ErrorCode errorCode, String path) {
        return error(List.of(error), message, errorCode, path);
    }
}
