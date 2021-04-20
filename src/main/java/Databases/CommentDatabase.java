package Databases;

import Entities.Comment;
import Entities.Post;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CommentDatabase implements Database<Post, Comment> {
    private final Map<Post, ArrayList<Comment>> postWithComments;

    public CommentDatabase() {
        this.postWithComments = new HashMap<>();
    }

    @Override
    public void add(Post post, Comment comment) {
        if (this.postWithComments.containsKey(post)) {
            this.postWithComments.get(post).add(comment);
        } else {
            ArrayList<Comment> comments = new ArrayList<>();
            comments.add(comment);
            this.postWithComments.put(post, comments);
        }
    }

    @Override
    public Collection<Comment> select(Post key) {
        return this.postWithComments.get(key);
    }
}
