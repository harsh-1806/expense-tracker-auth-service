package com.harsh.auth.enums;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum ErrorCode {
    // ====== COMMON ERRORS ======
    INTERNAL_SERVER_ERROR(1000, "Internal server error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_REQUEST(1001, "Invalid request", HttpStatus.BAD_REQUEST),
    VALIDATION_FAILED(1002, "Validation failed", HttpStatus.BAD_REQUEST),
    RESOURCE_NOT_FOUND(1003, "Resource not found", HttpStatus.NOT_FOUND),
    UNAUTHORIZED(1004, "Unauthorized access", HttpStatus.UNAUTHORIZED),
    FORBIDDEN(1005, "Access denied", HttpStatus.FORBIDDEN),

    // ====== USER ERRORS ======
    USER_NOT_FOUND(2001, "User not found", HttpStatus.NOT_FOUND),
    USER_ALREADY_EXISTS(2002, "User already exists", HttpStatus.CONFLICT),
    INVALID_CREDENTIALS(2003, "Invalid username or password", HttpStatus.UNAUTHORIZED),

    // ====== ORDER ERRORS ======
    ORDER_NOT_FOUND(3001, "Order not found", HttpStatus.NOT_FOUND),
    PAYMENT_FAILED(3002, "Payment failed", HttpStatus.BAD_GATEWAY);

    private final Integer code;
    private final String message;
    private final HttpStatus httpStatus;


}
