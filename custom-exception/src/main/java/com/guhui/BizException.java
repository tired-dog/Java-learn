package com.guhui;

public class BizException extends RuntimeException {
    private final int code;

    public BizException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static class ResourceNotFoundException extends BizException {
        public ResourceNotFoundException(Long id) {
            super(404, "资源不存在: " + id);
        }
    }
}
