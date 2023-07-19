package com.jd.jdbc.monitor;

import com.google.common.collect.Lists;
import java.util.List;

public class DefaultConfig {
    public static final double[] BUCKETS = {0.001, 0.002, 0.005, 0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1.0, 2.0, 5.0, 10.0};

    public static final List<String> HEALTH_CHECK_LABEL_NAMES = Lists.newArrayList("Cell", "Keyspace", "Shard", "TabletType", "Serving", "TabletAlias", "Uid", "IP");
}
