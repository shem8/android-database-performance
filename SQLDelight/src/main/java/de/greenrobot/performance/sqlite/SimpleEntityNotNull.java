package de.greenrobot.performance.sqlite;

import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.squareup.sqldelight.RowMapper;

/**
 * Simple entity for performance testing.
 */
@AutoValue
public abstract class SimpleEntityNotNull implements SimpleEntityNotNullModel {

    public static final Factory<SimpleEntityNotNull> FACTORY = new Factory<>(
            new Creator<SimpleEntityNotNull>() {
                @Override
                public SimpleEntityNotNull create(long _id, boolean simple_boolean, int simple_byte,
                        short simple_short, int simple_int, long simple_long, float simple_float,
                        double simple_double, @NonNull String simple_string,
                        @NonNull byte[] simple_byte_array) {
                    return new AutoValue_SimpleEntityNotNull(_id, simple_boolean, simple_byte,
                            simple_short, simple_int, simple_long, simple_float,
                            simple_double, simple_string, simple_byte_array);
                }
            });

    public static final RowMapper<SimpleEntityNotNull> MAPPER = FACTORY.select_allMapper();
}
