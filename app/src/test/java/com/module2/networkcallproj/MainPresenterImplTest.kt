package com.module2.networkcallproj

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.networkcallproj.Data.data.models.TourNewsModel
import com.module2.networkcallproj.Data.data.models.TourNewsModelImpl
import com.module2.networkcallproj.mvp.presenter.MainPresenterImpl
import com.module2.networkcallproj.mvp.views.MainView
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.annotation.Config


@RunWith(AndroidJUnit4::class)
@Config(manifest = Config.NONE)
class MainPresenterImplTest {

    private lateinit var mPresenter  : MainPresenterImpl

    @RelaxedMockK
    private lateinit var  mView : MainView

    private  lateinit var mModel : TourNewsModel

    @Before
    fun setUpPresenter(){
        MockKAnnotations.init(this)

        TourNewsModelImpl.initDatabase(ApplicationProvider.getApplicationContext())
        mModel=TourNewsModelImpl

        mPresenter= MainPresenterImpl()
        mPresenter.initPresenter(mView)
        mPresenter.mModel = this.mModel

    }
    @Test
    fun onTapTourItem_callNavigaterToDetail(){
        val country = CountryVO()
        country.name="Malaysia"
        mPresenter.onTapForDetail(country.name)
        verify {
            mView.nevigateToDetail(country.name)
        }


//        mPresenter.onTapTourItem(tour.name)
//        verify {
//            mView.navigateToDetail(tour.name)
//        }
    }


}