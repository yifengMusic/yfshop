package com.yifeng.yfshop.common.dto.constants;

public enum HttpStatusConstants {

    BAD_GATEWAY(502, "从上游服务器接受到无效相应111");

    private int status;

    private String content;

    HttpStatusConstants(int status, String content) {
        this.status = status;
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public String getContent() {
        return content;
    }
}
