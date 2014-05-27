package com.lambdaworks.redis.internal;

import com.lambdaworks.redis.RedisChannelHandler;
import com.lambdaworks.redis.protocol.Command;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @since 26.05.14 08:18
 */
public interface RedisChannelWriter<K, V> {
    void write(Command<K, V, ?> command);

    void close();

    void setRedisChannelHandler(RedisChannelHandler<K, V> redisChannelHandler);
}
