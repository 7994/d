// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import com.wsusingretrofitdemo.custom.CustomHeader;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListActivity_ViewBinding implements Unbinder {
  private ListActivity target;

  @UiThread
  public ListActivity_ViewBinding(ListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ListActivity_ViewBinding(ListActivity target, View source) {
    this.target = target;

    target.header = Utils.findRequiredViewAsType(source, R.id.header, "field 'header'", CustomHeader.class);
    target.listiew = Utils.findRequiredViewAsType(source, R.id.listiew, "field 'listiew'", RecyclerView.class);
    target.swipeContainer = Utils.findRequiredViewAsType(source, R.id.swipeContainer, "field 'swipeContainer'", SwipeRefreshLayout.class);
    target.txtNoDataFound = Utils.findRequiredViewAsType(source, R.id.txtNoDataFound, "field 'txtNoDataFound'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.header = null;
    target.listiew = null;
    target.swipeContainer = null;
    target.txtNoDataFound = null;
  }
}
