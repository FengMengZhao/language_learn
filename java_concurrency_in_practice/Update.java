package org.fmz.concurrency;

public class Update{
    private final Author author;
    private final String updateText;

    private Update(Builder b){
        author = b.author;
        updateText = b.updateText;
    }

    public static class Builder implements ObjBuilder<Update>{
        private Author author;
        private String updateText;

        public Builder author(Author author){
            this.author = author;
            return this;
        }

        public Builder updateText(String updateText){
            this.updateText = updateText;
            return this;
        }

        public Update build(){
            return new Update();
        }
    }
}
