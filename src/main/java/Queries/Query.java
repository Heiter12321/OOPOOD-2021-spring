package Queries;

import java.util.Collection;

public interface Query<T> {
    Collection<T> select();
}
