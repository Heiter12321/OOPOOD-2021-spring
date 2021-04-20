package Queries;

import Entities.Entity;

public class LikeQuery {
    private final Entity entity;

    LikeQuery(Entity entity) {
        this.entity = entity;
    }

    public int select() {
        return this.entity.getLikesCount();
    }
}
