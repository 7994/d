// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.custom;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CustomDialog_ViewBinding implements Unbinder {
  private CustomDialog target;

  @UiThread
  public CustomDialog_ViewBinding(CustomDialog target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CustomDialog_ViewBinding(CustomDialog target, View source) {
    this.target = target;

    target.progressBar1 = Utils.findRequiredViewAsType(source, R.id.progressBar1, "field 'progressBar1'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CustomDialog target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar1 = null;
  }
}
