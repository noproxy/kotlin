/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.time

import kotlin.js.JsName

/**
 * The most precise clock available in the platform, whose readings increase monotonically over time.
 */
public expect object MonoClock : Clock

/**
 * An abstract class used to implement clocks that return their readings as [Long] values in the specified [unit].
 */
public abstract class LongReadingClock(protected val unit: DurationUnit) : Clock {
    protected abstract fun reading(): Long

    override fun mark(): ClockMark = object : ClockMark {
        val startedAt = reading()
        override fun elapsed(): Duration = (reading() - startedAt).toDuration(this@LongReadingClock.unit)
    }
}

/**
 * An abstract class used to implement clocks that return their readings as [Double] values in the specified [unit].
 */
public abstract class DoubleReadingClock(protected val unit: DurationUnit) : Clock {
    protected abstract fun reading(): Double

    override fun mark(): ClockMark = object : ClockMark {
        val startedAt = reading()
        override fun elapsed(): Duration = (reading() - startedAt).toDuration(this@DoubleReadingClock.unit)
    }
}

/**
 * A clock, whose readings can be preset and changed manually. It is useful as a predictable source of time in tests.
 */
public class TestClock(
    @JsName("readingValue")
    var reading: Long = 0L,
    unit: DurationUnit = DurationUnit.NANOSECONDS
) : LongReadingClock(unit) {
    override fun reading(): Long = reading
}

/*
public interface WallClock {
    fun currentTimeMilliseconds(): Long

    companion object : WallClock, LongReadingClock() {
        override fun currentTimeMilliseconds(): Long = System.currentTimeMillis()
        override fun reading(): Long = System.currentTimeMillis()
        override val unit: DurationUnit get() = DurationUnit.MILLISECONDS
    }
}
*/