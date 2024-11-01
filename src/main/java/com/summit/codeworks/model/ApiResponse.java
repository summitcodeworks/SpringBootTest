package com.summit.codeworks.model;

public class ApiResponse<T> {
    private Headers headers;
    private T response;

    public ApiResponse(int responseCode, String responseMessage, T response) {
        this.headers = new Headers(responseCode, responseMessage);
        this.response = response;
    }

    public Headers getHeaders() {
        return headers;
    }

    public T getResponse() {
        return response;
    }

    public static class Headers {
        private int responseCode;
        private String responseMessage;

        public Headers(int responseCode, String responseMessage) {
            this.responseCode = responseCode;
            this.responseMessage = responseMessage;
        }

        public int getResponseCode() {
            return responseCode;
        }

        public String getResponseMessage() {
            return responseMessage;
        }
    }
}
