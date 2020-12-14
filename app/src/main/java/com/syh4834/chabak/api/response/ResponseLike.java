package com.syh4834.chabak.api.response;

public class ResponseLike {
    private final int status;
    private final boolean success;
    private final String message;

    public ResponseLike(int status, boolean success, String message) {
        this.status = status;
        this.success = success;
        this.message = message;
    }

    public int getStatus() { return status; }
    public boolean getSuccess() { return success; }
    public String getMessage() { return message; }
}
