package com.easykar.rest.model.registration;

public class RegistrationResponse {
    private String response_code;
    private String response_msg;
    private Users registration_result;
    
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
    
    public Users getRegistration_result() {
        return registration_result;
    }
    
    public void setRegistration_result(Users registration_result) {
        this.registration_result = registration_result;
    }
    
}
