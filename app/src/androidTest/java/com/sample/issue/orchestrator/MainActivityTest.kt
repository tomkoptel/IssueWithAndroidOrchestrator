package com.sample.issue.orchestrator

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @JvmField @Rule val rule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun test_dummy2() {
        onView(withId(R.id.textView)).check(matches(ViewMatchers.withText("Hello World!")))
    }
}
