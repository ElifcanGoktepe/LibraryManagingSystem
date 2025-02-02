package com.elifcan.librarymanagingsystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> {

    Integer code;
    String message;
    T data;
    Boolean isSuccess;

}
