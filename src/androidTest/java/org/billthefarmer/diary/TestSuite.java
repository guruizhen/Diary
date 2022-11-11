package org.billthefarmer.diary;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestSuite {

    @Rule
    public ActivityScenarioRule<Diary> activityScenarioRule = new ActivityScenarioRule<>(Diary.class);

    @Test
    public void testTest() {
        onView(withId(R.id.edit)).perform(click());
    }
}
