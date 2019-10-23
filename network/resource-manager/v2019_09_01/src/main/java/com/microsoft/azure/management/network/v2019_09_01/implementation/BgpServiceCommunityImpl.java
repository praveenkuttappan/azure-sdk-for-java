/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_09_01.BgpServiceCommunity;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.BGPCommunity;

class BgpServiceCommunityImpl extends GroupableResourceCoreImpl<BgpServiceCommunity, BgpServiceCommunityInner, BgpServiceCommunityImpl, NetworkManager> implements BgpServiceCommunity {
    BgpServiceCommunityImpl(String name, BgpServiceCommunityInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<BgpServiceCommunity> createResourceAsync() {
        BgpServiceCommunitiesInner client = this.manager().inner().bgpServiceCommunities();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<BgpServiceCommunity> updateResourceAsync() {
        BgpServiceCommunitiesInner client = this.manager().inner().bgpServiceCommunities();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<BgpServiceCommunityInner> getInnerAsync() {
        BgpServiceCommunitiesInner client = this.manager().inner().bgpServiceCommunities();
        return null; // NOP getInnerAsync implementation as get is not supported
    }



    @Override
    public List<BGPCommunity> bgpCommunities() {
        return this.inner().bgpCommunities();
    }

    @Override
    public String serviceName() {
        return this.inner().serviceName();
    }

}
