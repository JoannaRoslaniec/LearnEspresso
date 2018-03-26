package com.example.android.autofill.app;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        onView(allOf(withId(R.id.buttonLabel), withText("Sample Login Using EditTexts"))).perform(click());
        onView(withId(R.id.usernameLabel)).check(matches(withText("Username")));
        onView(withId(R.id.usernameField)).perform(typeText("Sample_User"));
        onView(withId(R.id.passwordField)).perform(typeText("password"));
        onView(withId(R.id.login)).perform(click());
    }}