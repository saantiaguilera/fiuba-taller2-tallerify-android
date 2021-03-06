package com.u.tallerify.presenter.base.cards;

import android.support.annotation.NonNull;
import com.u.tallerify.contract.base.cards.HorizontalCardContract;
import com.u.tallerify.utils.adapter.GenericAdapter;
import java.util.List;

/**
 * Created by saguilera on 3/12/17.
 */
public class HorizontalCardPresenter extends GenericAdapter.ItemPresenter<HorizontalCardContract.View>
        implements HorizontalCardContract.Presenter {

    private @NonNull List<GenericAdapter.ItemSupplier> suppliers;

    public HorizontalCardPresenter(@NonNull List<GenericAdapter.ItemSupplier> suppliers) {
        this.suppliers = suppliers;
    }

    @Override
    protected void onRender(@NonNull final HorizontalCardContract.View view) {
        view.setData(suppliers);
    }

}
