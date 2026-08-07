package com.br.bani_backend.entity.enums;

public enum ItemType {
    ARTICLE("article"),
    VIDEO("video"),
    PODCAST("podcast"),
    SONG("song"),
    DOCUMENT("document"),
    BOOK("book");

    public String type;

    ItemType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
