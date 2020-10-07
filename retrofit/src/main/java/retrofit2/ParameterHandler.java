package retrofit2;

import javax.annotation.Nullable;
import java.io.IOException;

/**
 * TODO
 */
public interface ParameterHandler<T> {
    /**
     * TODO
     */
    void apply(RequestBuilder builder, @Nullable T value) throws IOException;
}
