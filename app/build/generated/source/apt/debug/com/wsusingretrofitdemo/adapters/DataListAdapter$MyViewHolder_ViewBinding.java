// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataListAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private DataListAdapter.MyViewHolder target;

  @UiThread
  public DataListAdapter$MyViewHolder_ViewBinding(DataListAdapter.MyViewHolder target,
      View source) {
    this.target = target;

    target.txtTitle = Utils.findRequiredViewAsType(source, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    target.row = Utils.findRequiredViewAsType(source, R.id.row, "field 'row'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DataListAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtTitle = null;
    target.row = null;
  }
}
