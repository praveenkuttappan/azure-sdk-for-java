// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.faultinjection;

import com.azure.cosmos.implementation.directconnectivity.rntbd.RntbdRequestRecord;

import java.time.Duration;
import java.util.function.Consumer;

/***
 * Rntbd server error injector.
 */
public interface IRntbdServerErrorInjector {

    /***
     * Inject server response delay.
     *
     * @param requestRecord the request record.
     * @param writeRequestWithDelayConsumer the consumer to be executed if applicable rule is found.
     * @return flag to indicate whether server response delay is injected.
     */
    boolean injectRntbdServerResponseDelay(
        RntbdRequestRecord requestRecord,
        Consumer<Duration> writeRequestWithDelayConsumer);

    /***
     * Inject server response error.
     *
     * @param requestRecord the request record.
     * @return flag to indicate whether server response error is injected.
     */
    boolean injectRntbdServerResponseError(RntbdRequestRecord requestRecord);

    /***
     * Inject server connection delay error.
     *
     * @param requestRecord the request record.
     * @param openConnectionWithDelayConsumer the consumer to be executed if applicable rule is found.
     * @return flag to indicate whether server connection delay rule is injected.
     */
    boolean injectRntbdServerConnectionDelay(
        RntbdRequestRecord requestRecord,
        Consumer<Duration> openConnectionWithDelayConsumer);
}
