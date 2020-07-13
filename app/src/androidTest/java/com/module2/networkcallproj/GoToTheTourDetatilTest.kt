package com.module2.networkcallproj

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.module2.networkcallproj.activities.MainActivity
import com.module2.networkcallproj.viewHolders.CountryViewHolder
import com.module2.networkcallproj.viewHolders.TourViewHolder
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class GoToTheTourDetatilTest {

    private val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)


    @Before
    open fun setUp(){
        activityTestRule.launchActivity(Intent())
    }


    @Test
    fun goToTheTourDetailList(){

        //thrad.sleep
        Thread.sleep(2000)
        onView(withId(R.id.CountryRecycler))
            .perform(RecyclerViewActions.actionOnItemAtPosition<CountryViewHolder>(0,ViewActions.click()))

        onView(withId(R.id.tvdetail))
            .check(matches(isDisplayed()))
   // onView(withId((R.id.TourRecycler))

//        .perform(RecyclerViewActions.actionOnItemAtPosition<TourViewHolder>(0,
//            ViewActions.click()
//        ))
    }




    @Test
    fun checkCountryList(){
        onView(withId(R.id.CountryRecycler)).check(matches(isDisplayed()))
          //  .perform(RecyclerViewActions.actionOnItemAtPosition<CountryViewHolder>(1,ViewActions.click()))
        onView(withId(R.id.TourRecycler)).check(matches(isDisplayed()))

    }
}