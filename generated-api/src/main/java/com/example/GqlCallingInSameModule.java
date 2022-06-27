package com.example;

public class GqlCallingInSameModule {

    public <T extends Query.Data> T query(Query<T> query) {
        //normally there will be passing query into client
        throw new IllegalStateException("");
    }

    public void callQuery() {
        //this one does not show error in IDE
        query(new HelloQuery(""));
    }
}
