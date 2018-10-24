// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GetListAdapter$MyViewHolder_ViewBinding implements Unbinder {
  private GetListAdapter.MyViewHolder target;

  @UiThread
  public GetListAdapter$MyViewHolder_ViewBinding(GetListAdapter.MyViewHolder target, View source) {
    this.target = target;

    target.txtText = Utils.findRequiredViewAsType(source, R.id.txtText, "field 'txtText'", TextView.class);
    target.row = Utils.findRequiredViewAsType(source, R.id.row, "field 'row'", LinearLayout.class);
    target.btnDelete = Utils.findRequiredViewAsType(source, R.id.btnDelete, "field 'btnDelete'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GetListAdapter.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtText = null;
    target.row = null;
    target.btnDelete = null;
  }
}
