package Commands;

import Entities.Entity;

public class LikeCommand {
    public LikeCommand() {}

    public void execute(Entity entity) {
        entity.like();
    }
}
