package com.example.guertz.hobbitchat.Tools.PageInterfaces;

import com.example.guertz.hobbitchat.Tools.CustomViews.ScrollViewExt;

/**
 * Created by guertz on 03/08/17.
 */

public interface ScrollViewListener {

    void onScrollChanged(ScrollViewExt scrollView,
                         int x, int y, int oldx, int oldy);

}
