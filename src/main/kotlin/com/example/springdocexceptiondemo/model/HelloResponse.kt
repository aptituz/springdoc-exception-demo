package com.example.springdocexceptiondemo.model

import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
data class HelloResponse(val text: String)