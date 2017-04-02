package com.ninghoo.beta.weibofragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ninghoo.beta.weibofragment.Fragment.HomeFragment;

public class MainActivity extends AppCompatActivity
{
//    private List<Fragment> mTabContents = new ArrayList<Fragment>();
//
//    private FragmentPagerAdapter mAdapter;
//    private ViewPager mViewPager;

    /**
     * 标识此Activity是否来自AccoutActivity的跳转
     */
    private boolean mComeFromAccoutActivity;

    /**
     * 首页fragment的标识
     */
    private static final String HOME_FRAGMENT = "home";

    /**
     * 首页fragment
     */
    private HomeFragment mHomeFragment;

    /**
     * 管理fragment的类
     */
    private FragmentManager mFragmentManager;

    /**
     * 对fragment进行添加,移除,替换,以及执行其他动作。
     */
    private FragmentTransaction mTransaction;

    /**
     * 标识处于哪个fragment
     */
    private String mCurrentIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        WeiboFragment mWeiboFragment = new WeiboFragment();
//        mTabContents.add(mWeiboFragment);
//        mViewPager = (ViewPager) findViewById(R.id.vp_pager);
//
//        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager())
//        {
//            @Override
//            public int getCount()
//            {
//                return mTabContents.size();
//            }
//
//            @Override
//            public Fragment getItem(int position)
//            {
//                return mTabContents.get(position);
//            }
//        };
//        mViewPager.setAdapter(mAdapter);

        mComeFromAccoutActivity = getIntent().getBooleanExtra("comeFromAccoutActivity", false);

        setTabFragment(HOME_FRAGMENT);
    }

    /**
     * 显示指定的fragment，并且把对应的导航栏的icon设置成高亮状态
     * 注意：
     * 1. 如果选项卡已经位于当前页，则执行其他操作
     *
     * @param index 需要切换到的具体页面
     */
    private void setTabFragment(String index) {
        if (mHomeFragment != null) {
//            mBarManager.showBottomBar(mButtonBar);
        }

//        if (!index.equals(mCurrentIndex)) {
            // switch方法才是真正去到fragment的具体操作，前面只是多了一层setTabFragment。
            switchToFragment(index);
//        } else {
//            alreadyAtFragment(mCurrentIndex);
//        }
    }

    private void switchToFragment(String index) {
//        mButtonBar.clearAnimation();
//        mButtonBar.setVisibility(View.VISIBLE);
        mTransaction = mFragmentManager.beginTransaction();

//        hideAllFragments(mTransaction);
//        switch (index) {
//            case HOME_FRAGMENT:
                showHomeFragment();
//                break;
//            case MESSAGE_FRAGMENT:
//                showMessageFragment();
//                break;
//            case DISCOVERY_FRAGMENT:
//                showDiscoveryFragment();
//                break;
//            case PROFILE_FRAGMENT:
//                showProfileFragment();
//                break;
//        }
        mCurrentIndex = index;
        mTransaction.commit();
    }

    /**
     * 切换到首页模块
     */
    private void showHomeFragment()
    {
        // 设置home图标被点击。
//        mHomeTab.setSelected(true);

        if (mHomeFragment == null)
        {
            mHomeFragment = HomeFragment.newInstance(mComeFromAccoutActivity);
            // Activity中，通过Transaction对象，来对FrameLayout和Fragment进行绑定。
            mTransaction.add(R.id.contentLayout, mHomeFragment, HOME_FRAGMENT);
        } else {
            mTransaction.show(mHomeFragment);
            if (mCurrentIndex.equals(HOME_FRAGMENT) && mHomeFragment != null && mHomeFragment.mRecyclerView != null) {
                mHomeFragment.scrollToTop(false);
            }
        }
//        mHomeFragment.setOnBarListener(new HomeFragment.onButtonBarListener() {
//            @Override
//            public void showButtonBar() {
//                mBarManager.showBottomBar(mButtonBar);
//            }
//
//            @Override
//            public void hideButtonBar() {
//                mBarManager.hideBottomBar(mButtonBar);
//            }
//        });
    }
}
