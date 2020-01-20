package com.carol.mySandcastle.response;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter @Setter
public class Response<T> {

    private T data;
    private List<String> errors;

    public List<String> getErrors() {
        if(this.errors == null){
            this.errors = new ArrayList<String>();
        }
        return errors;
    }

}
