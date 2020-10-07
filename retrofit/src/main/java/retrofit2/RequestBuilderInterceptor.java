package retrofit2;

import okhttp3.Request;

/**
 * TODO
 */
public interface RequestBuilderInterceptor {

    /**
     * TODO
     */
    void intercept(Request.Builder requestBuilder, Invocation invocation);

}
