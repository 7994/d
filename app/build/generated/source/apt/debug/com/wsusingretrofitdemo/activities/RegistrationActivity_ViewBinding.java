// Generated code from Butter Knife. Do not modify!
package com.wsusingretrofitdemo.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wsusingretrofitdemo.R;
import com.wsusingretrofitdemo.custom.CustomHeader;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegistrationActivity_ViewBinding implements Unbinder {
  private RegistrationActivity target;

  private View view2131230757;

  private View view2131230931;

  @UiThread
  public RegistrationActivity_ViewBinding(RegistrationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegistrationActivity_ViewBinding(final RegistrationActivity target, View source) {
    this.target = target;

    View view;
    target.edtNAme = Utils.findRequiredViewAsType(source, R.id.edtNAme, "field 'edtNAme'", EditText.class);
    target.edtPhone = Utils.findRequiredViewAsType(source, R.id.edtPhone, "field 'edtPhone'", EditText.class);
    target.edtEmail = Utils.findRequiredViewAsType(source, R.id.edtEmail, "field 'edtEmail'", EditText.class);
    target.edtPassword = Utils.findRequiredViewAsType(source, R.id.edtPassword, "field 'edtPassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnSignin, "field 'btnSignin' and method 'onClick'");
    target.btnSignin = Utils.castView(view, R.id.btnSignin, "field 'btnSignin'", Button.class);
    view2131230757 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.header = Utils.findRequiredViewAsType(source, R.id.header, "field 'header'", CustomHeader.class);
    view = Utils.findRequiredView(source, R.id.txtDob, "field 'txtDob' and method 'onClick'");
    target.txtDob = Utils.castView(view, R.id.txtDob, "field 'txtDob'", TextView.class);
    view2131230931 = view;
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
    RegistrationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.edtNAme = null;
    target.edtPhone = null;
    target.edtEmail = null;
    target.edtPassword = null;
    target.btnSignin = null;
    target.header = null;
    target.txtDob = null;

    view2131230757.setOnClickListener(null);
    view2131230757 = null;
    view2131230931.setOnClickListener(null);
    view2131230931 = null;
  }
}
