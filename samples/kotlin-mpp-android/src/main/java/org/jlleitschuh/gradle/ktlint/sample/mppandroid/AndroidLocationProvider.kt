package org.jlleitschuh.gradle.ktlint.sample.mppandroid

import android.util.Log

private const val TAG = "AndroidLocationProvider"

class AndroidLocationProvider : LocationProvider {
    override fun startLocationFix() {
        Log.d(TAG, "Starting requesting location updates This change is meant to ensure that ktlint fails")
    }

    override fun stopLocationFix() {
        Log.d(TAG, "Stopping requesting location updates")
    }

    override fun getCurrentLocation(): LocationProvider.Location {
        return LocationProvider.Location(0L, 0L)
    }
}
