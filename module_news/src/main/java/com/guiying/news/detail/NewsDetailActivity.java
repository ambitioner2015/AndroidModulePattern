package com.guiying.news.detail;

import android.os.Bundle;

import com.guiying.common.base.BaseActivity;

/**
 * <p>类说明</p>
 *
 * @author 张华洋 2017/7/1 13:13
 * @version V1.2.0
 * @name NewsDetailActivity
 */
public class NewsDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NewsDetailView detailView = new NewsDetailView(this);
        setContentView(detailView);
        String id = getIntent().getStringExtra("id");
        new NewsDetailPresenter(detailView).getNewsDetail(id);
    }

}
