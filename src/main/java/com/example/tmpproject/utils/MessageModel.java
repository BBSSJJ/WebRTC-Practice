package com.example.tmpproject.utils;

import lombok.Data;

@Data
public class MessageModel {
    String type;
    String name;
    String target;
    Object data;
}
