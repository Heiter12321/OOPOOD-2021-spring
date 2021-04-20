package Entities;

public class Comment implements Entity {
    private int likesCount;
    private final String comment;

    Comment(String comment) {
        this.likesCount = 0;
        this.comment = comment;
    }

    @Override
    public void like() {
        ++this.likesCount;
    }

    @Override
    public int getLikesCount() {
        return this.likesCount;
    }
}
