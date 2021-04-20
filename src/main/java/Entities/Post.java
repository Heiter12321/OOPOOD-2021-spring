package Entities;

public class Post implements Entity {
    private int likesCount;
    private final String id;
    private final String postContent;

    Post(String id, String postContent) {
        this.likesCount = 0;
        this.id = id;
        this.postContent = postContent;
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
