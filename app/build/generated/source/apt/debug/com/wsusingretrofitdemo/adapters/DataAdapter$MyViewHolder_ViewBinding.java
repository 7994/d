// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private VersionDataAdapter.MyViewHolder target;

  @UiThread
  public DataAdapter$MyViewHolder_ViewBinding(VersionDataAdapter.MyViewHolder target, View source) {
    this.target = target;

    target.tv_name = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'tv_name'", TextView.class);
    target.tv_version = Utils.findRequiredViewAsType(source, R.id.tv_version, "field 'tv_version'", TextView.class);
    target.tv_api_level = Utils.findRequiredViewAsType(source, R.id.tv_api_level, "field 'tv_api_level'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VersionDataAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_name = null;
    target.tv_version = null;
    target.tv_api_level = null;
  }
}
