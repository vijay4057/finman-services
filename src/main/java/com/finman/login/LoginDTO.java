package com.finman.login;

import com.finman.dto.BaseDTO;

public class LoginDTO extends BaseDTO {

    private static final long serialVersionUID = 1413865564601560643L;

    /**
     * Default Constructor
     */
    private LoginDTO() {
        super();
    }

    /**
     * The emailId
     */
    private String emailId;
    /**
     * The Password
     */
    private String password;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
