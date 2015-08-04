/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.watcher.support.clock;

import org.elasticsearch.common.unit.TimeValue;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 *
 */
public interface Clock {

    long millis();

    long nanos();

    DateTime nowUTC();

    DateTime now(DateTimeZone timeZone);

    TimeValue timeElapsedSince(DateTime time);

}
