package Commands;

import Entities.Post;
import Databases.Database;


public class PostCommand implements EntityCommand {
    private final Database<String, Post> database;
    private final String id;
    private final Post post;

    public PostCommand(Database<String, Post> database, String id, Post post) {
        this.database = database;
        this.id = id;
        this.post = post;
    }

    @Override
    public void execute() {
        database.add(id, post);
    }
}
