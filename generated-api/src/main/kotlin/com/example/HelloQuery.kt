package com.example

class HelloQuery(
    val name: String
) : Query<HelloQuery.Data> {

    override fun adapter(): Adapter<Data> = TODO("")

    data class Data(
        val hello: String
    ) : Query.Data
}