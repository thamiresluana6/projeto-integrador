package com.example.projetointegrador.exceptions;
import java.io.Serializable;


import lombok.Data;

import java.io.Serializable;
@Data
public class StandardException implements Serializable {
    private static final long serialVersionUID = 1L;


    private String timestamp;
    private String status;
    private String error;
    private String trace;

    public StandardException(){

    }

    public void setTrace(String s) {
    }
    public void setError(String message) {
    }
    public void setStatus(String valueOf) {
    }
    public void setTimestamp(String valueOf) {
    }

}
