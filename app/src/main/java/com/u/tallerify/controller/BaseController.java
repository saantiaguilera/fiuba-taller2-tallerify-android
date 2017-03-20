package com.u.tallerify.controller;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler;
import com.bluelinelabs.conductor.rxlifecycle.RxController;
import com.u.tallerify.controller.abstracts.AlertDialogController;
import com.u.tallerify.utils.RouterInteractor;

/**
 * Created by saguilera on 3/12/17.
 */
public abstract class BaseController extends RxController {

    /**
     * Display the dialog, create a transaction and pushing the controller.
     * @param tag The tag for this controller
     */
    public void showDialog(@NonNull AlertDialogController controller, @Nullable String tag) {
        RouterInteractor.instance().auxRouter().pushController(RouterTransaction.with(controller)
            .pushChangeHandler(new FadeChangeHandler(false))
            .popChangeHandler(new FadeChangeHandler())
            .tag(tag));
    }

}
