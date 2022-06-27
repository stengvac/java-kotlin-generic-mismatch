package com.example.someservice;

import com.example.HelloQuery;
import com.example.Query;

public class GqlCallingService {

    public void mySuperLogicWithGqlCall() {
        //here idea show error
        query(new HelloQuery(""));
    }

    public <T extends Query.Data> T query(Query<T> query) {
        //normally there will be passing query into client
        throw new IllegalStateException("");
    }
}
