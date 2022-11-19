package com.example.projetointegrador.exceptions;

<<<<<<< HEAD
import java.io.Serializable;

public class StandardException implements Serializable {
    private static  final long serialVersionUID = 1L;
=======
import lombok.Data;

import java.io.Serializable;
@Data
public class StandardException implements Serializable {
    private static final long serialVersionUID = 1L;
>>>>>>> 7f12708583808501d386b35c1328419c2ae694f5

    private String timestamp;
    private String status;
    private String error;
    private String trace;

    public StandardException(){

    }
<<<<<<< HEAD
    public void setTrace(String s) {
    }
    public void setError(String message) {
    }
    public void setStatus(String valueOf) {
    }
    public void setTimestamp(String valueOf) {
    }
=======
>>>>>>> 7f12708583808501d386b35c1328419c2ae694f5
}
