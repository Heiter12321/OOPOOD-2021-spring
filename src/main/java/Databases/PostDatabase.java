package Databases;

import Entities.Post;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PostDatabase implements Database<String, Post> {
    private final Map<String, ArrayList<Post>> idWithPosts;

    PostDatabase() {
        this.idWithPosts = new HashMap<>();
    }

    @Override
    public void add(String id, Post post) {
        if (this.idWithPosts.containsKey(id)) {
            this.idWithPosts.get(id).add(post);
        } else {
            ArrayList<Post> posts = new ArrayList<>();
            posts.add(post);
            this.idWithPosts.put(id, posts);
        }
    }

    @Override
    public Collection<Post> select(String key) {
        return this.idWithPosts.get(key);
    }
}
