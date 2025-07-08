package Generics;
class Word<K,V>{
    private K keyword;
    private V desc;

    public  Word(){};

    public Word(K keyword, V desc) {
        this.keyword = keyword;
        this.desc = desc;
    }

    public K getKeyword() {
        return keyword;
    }

    public void setKeyword(K keyword) {
        this.keyword = keyword;
    }

    public V getDesc() {
        return desc;
    }

    public void setDesc(V desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "keyword: " + keyword + "- " + desc;
    }
}

public class Myltiparameter {
    public static void main(String[] args) {
        Word<String, String> word =new Word();
        Word<Integer, Integer> test = new Word<>(1,1);

        word.setKeyword("HTML");
        word.setDesc("HTML is HyperText Markup Language that use to build the structure of web page!!");

        System.out.println(word);
    }
}
