package ren.superk.core;

public enum SortEnum {
    CREATED("created"),
    VOTEUPS("voteups"),
    ;
    private String value;

    SortEnum(String value) {
        this.value = value;
    }
}
