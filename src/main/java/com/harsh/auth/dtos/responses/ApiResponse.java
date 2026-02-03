package com.harsh.auth.dtos.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.harsh.auth.enums.ErrorCode;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ApiResponse<T> {
    private Boolean success;
    private String message;
    private T data;

    List<String> errors;
    private ErrorCode errorCode;

    @Builder.Default
    private Instant timestamp = Instant.now();

    private String traceId;
    private String path;
}
