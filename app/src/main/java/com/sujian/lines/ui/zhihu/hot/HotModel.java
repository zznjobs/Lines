package com.sujian.lines.ui.zhihu.hot;

import com.sujian.lines.api.Api;
import com.sujian.lines.base.util.helper.RxSchedulers;
import com.sujian.lines.data.entity.HotListBean;

import rx.Observable;

/**
 * Created by sujian on 2016/9/13.
 * Mail:121116111@qq.com
 */
public class HotModel implements HotContract.Model {
    @Override
    public Observable<HotListBean> getHot() {
        return Api.getInstance()
                .getZhihuApiService()
                .getHotList()
                .compose(RxSchedulers.io_main());
    }
}
