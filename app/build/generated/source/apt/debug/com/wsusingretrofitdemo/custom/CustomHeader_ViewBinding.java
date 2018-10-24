// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.custom;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CustomHeader_ViewBinding implements Unbinder {
  private CustomHeader target;

  private View view2131230821;

  @UiThread
  public CustomHeader_ViewBinding(CustomHeader target) {
    this(target, target);
  }

  @UiThread
  public CustomHeader_ViewBinding(final CustomHeader target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.imgLeft, "field 'imgLeft' and method 'onClick'");
    target.imgLeft = Utils.castView(view, R.id.imgLeft, "field 'imgLeft'", ImageView.class);
    view2131230821 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.txtCenterTitle = Utils.findRequiredViewAsType(source, R.id.txtCenterTitle, "field 'txtCenterTitle'", TextView.class);
    target.imgRight = Utils.findRequiredViewAsType(source, R.id.imgRight, "field 'imgRight'", ImageView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CustomHeader target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgLeft = null;
    target.txtCenterTitle = null;
    target.imgRight = null;
    target.toolbar = null;

    view2131230821.setOnClickListener(null);
    view2131230821 = null;
  }
}
