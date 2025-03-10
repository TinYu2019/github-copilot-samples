package com.example.mykotlinapp

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun buttonClick_displaysToast() {
        // Type text into the EditText
        onView(withId(R.id.editText)).perform(typeText("Test input"))

        // Perform click on the button
        onView(withId(R.id.button)).perform(click())

        // Check if the toast message is displayed
        onView(withText("Button clicked: Test input")).inRoot(ToastMatcher()).check(matches(isDisplayed()))
    }
}
