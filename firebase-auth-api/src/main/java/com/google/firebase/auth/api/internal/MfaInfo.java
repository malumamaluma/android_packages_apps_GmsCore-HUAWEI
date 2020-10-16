/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.google.firebase.auth.api.internal;

import org.microg.safeparcel.AutoSafeParcelable;

public class MfaInfo extends AutoSafeParcelable {


    public static final Creator<MfaInfo> CREATOR = new AutoCreator<>(MfaInfo.class);
}
