package com.example

/**
 * Those interfaces are copied and simplified from https://github.com/apollographql/apollo-kotlin where are used while
 * GQL Query/Mutation are generated from written queries
 */
interface Executable<D : Executable.Data> {
    //this is normally used in Apollo gen lib here is it just for example
    fun adapter(): Adapter<D>

    /**
     * Marker interface for generated models
     */
    interface Data
}

/**
 * Represents a GraphQL operation (mutation, query or subscription).
 */
interface Operation<D : Operation.Data> : Executable<D> {

    /**
     * Marker interface for generated models built from data returned by the server in response to this operation.
     */
    interface Data : Executable.Data
}

interface Query<D : Query.Data> : Operation<D> {
    interface Data: Operation.Data
}

interface Adapter<D>
