package com.example.yiweizhang.csci3130project;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void Test1() {
        onView(withId(R.id.userEnteredEmail)).
                perform(typeText("aaabbbc@dal.ca"),closeSoftKeyboard());
        onView(withId(R.id.userEnteredPassword)).
                perform(typeText("1234567"),closeSoftKeyboard());
        onView(withId(R.id.clickLoginBtn)).perform(click());




    }
    public void Test2() {
        onView(withId(R.id.userEnteredEmail)).
                perform(typeText("abc@dal.ca"),closeSoftKeyboard());
        onView(withId(R.id.userEnteredPassword)).
                perform(typeText("1234567"),closeSoftKeyboard());
        onView(withId(R.id.clickLoginBtn)).perform(click());




    }


}
