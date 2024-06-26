package com.woof.api.product.model.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ProductManagerListRes {
    private Boolean isSuccess;
    private Integer code;
    private String message;
    private List<ProductManagerReadRes> result;
    private Boolean success;
}