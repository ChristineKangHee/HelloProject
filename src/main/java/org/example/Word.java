package org.example;

public class Word {
    private String name;
    private String meaning;//멤버 변수 캡슐화는 밖에서 보려고 해도 안 보인다. 밖에서 써야되니 getter/setter 만듬. default(안 쓰는 거)

    public Word() {
    }

    public Word(String name) {
        this.name = name;
    }

    public Word(String name, String meaning) {
        this.name = name;
        this.meaning = meaning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
