package quotes;

import java.util.Arrays;

public class Quote {
    public String[] tags;
    public String author;
    public String likes;
    public String text;

    public Quote(String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }


    @Override
    public String toString() {
        return this.author + " : " + this.text;
    }

    //    public String[] getTags() {
//        return tags;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getLikes() {
//        return likes;
//    }
//
//    public String getText() {
//        return text;
//    }
}



