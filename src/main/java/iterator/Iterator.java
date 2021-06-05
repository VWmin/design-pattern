package iterator;

/**
 * @author vwmin
 * @version 1.0
 * @date 2021/6/3 16:59
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
