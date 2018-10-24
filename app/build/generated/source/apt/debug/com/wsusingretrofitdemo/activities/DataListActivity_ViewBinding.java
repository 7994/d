// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataListActivity_ViewBinding implements Unbinder {
  private DataListActivity target;

  @UiThread
  public DataListActivity_ViewBinding(DataListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DataListActivity_ViewBinding(DataListActivity target, View source) {
    this.target = target;

    target.lstview = Utils.findRequiredViewAsType(source, R.id.lstview, "field 'lstview'", RecyclerView.class);
    target.swipeContainer = Utils.findRequiredViewAsType(source, R.id.swipeContainer, "field 'swipeContainer'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DataListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lstview = null;
    target.swipeContainer = null;
  }
}
