package com.easykar.rest.model.registration;

public class LoginResponse {
    private String response_code;
    private String response_msg;
    private Users login_result;
    
    public String getResponse_code() {
        return response_code;
    }
    
    public void setResponse_code(String response_code) {
        this.response_code = response_code;
    }
    
    public String getResponse_msg() {
        return response_msg;
    }
    
    public void setResponse_msg(String response_msg) {
        this.response_msg = response_msg;
    }
    
    public Users getLogin_result() {
        return login_result;
    }
    
    public void setLogin_result(Users login_result) {
        this.login_result = login_result;
    }
    
}
