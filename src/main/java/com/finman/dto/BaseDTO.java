package com.finman.dto;

import java.io.Serializable;

public class BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * private Default constructors
     */
    protected BaseDTO() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
