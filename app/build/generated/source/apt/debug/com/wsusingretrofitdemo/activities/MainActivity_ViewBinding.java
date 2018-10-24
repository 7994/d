// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import com.wsusingretrofitdemo.custom.CustomHeader;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131230932;

  private View view2131230933;

  private View view2131230821;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.header = Utils.findRequiredViewAsType(source, R.id.header, "field 'header'", CustomHeader.class);
    view = Utils.findRequiredView(source, R.id.txtHome, "field 'txtHome' and method 'onClick'");
    target.txtHome = Utils.castView(view, R.id.txtHome, "field 'txtHome'", TextView.class);
    view2131230932 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.txtLogout, "field 'txtLogout' and method 'onClick'");
    target.txtLogout = Utils.castView(view, R.id.txtLogout, "field 'txtLogout'", TextView.class);
    view2131230933 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.navigationView = Utils.findRequiredViewAsType(source, R.id.navigation_view, "field 'navigationView'", NavigationView.class);
    target.drawer = Utils.findRequiredViewAsType(source, R.id.drawer, "field 'drawer'", DrawerLayout.class);
    target.listiew = Utils.findRequiredViewAsType(source, R.id.listiew, "field 'listiew'", RecyclerView.class);
    target.swipeContainer = Utils.findRequiredViewAsType(source, R.id.swipeContainer, "field 'swipeContainer'", SwipeRefreshLayout.class);
    view = Utils.findRequiredView(source, R.id.imgLeft, "method 'onClick'");
    view2131230821 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.header = null;
    target.txtHome = null;
    target.txtLogout = null;
    target.navigationView = null;
    target.drawer = null;
    target.listiew = null;
    target.swipeContainer = null;

    view2131230932.setOnClickListener(null);
    view2131230932 = null;
    view2131230933.setOnClickListener(null);
    view2131230933 = null;
    view2131230821.setOnClickListener(null);
    view2131230821 = null;
  }
}
