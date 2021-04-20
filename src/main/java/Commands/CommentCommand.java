package Commands;

import Entities.Comment;
import Entities.Post;
import Databases.Database;

public class CommentCommand implements EntityCommand {
    private final Database<Post, Comment> database;
    private final Post post;
    private final Comment comment;

    public CommentCommand(Database<Post, Comment> database, Post post, Comment comment) {
        this.database = database;
        this.post = post;
        this.comment = comment;
    }

    @Override
    public void execute() {
        database.add(post, comment);
    }
}
