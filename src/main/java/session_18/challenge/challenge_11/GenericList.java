package session_18.challenge.challenge_11;

import java.util.List;

@FunctionalInterface
public interface GenericList<T> {

    boolean contain(List<T> list, T element);
}