package com.company.prjoject.web.screens.person;

import com.company.prjoject.entity.Person;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;

@UiController("super_PersonBrowse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personGrid")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<Person> {

    @Inject
    private DataManager dataManager;
    @Inject
    private DataGrid<Person> personGrid;
    @Inject
    private UiComponents uiComponents;

    @Install(to = "personGrid.deleteTs", subject = "columnGenerator")
    private Component personGridDeleteTsColumnGenerator(DataGrid.ColumnGeneratorEvent<Person> event) {

        if (event.getItem().getDeleteTs() == null) {
            Label label = uiComponents.create(Label.class);
            label.setIcon(CubaIcon.REMOVE_ACTION.source());
            return label;
        }
        return null;

        /*Label label = uiComponents.create(Label.class);
        label.setIcon(CubaIcon.REMOVE_ACTION.source());
        return label;*/


    }





    @Install(to = "personGrid.restore", subject = "enabledRule")
    private boolean personGridRestoreEnabledRule() {
        return personGrid.getSingleSelected() != null;
    }


    @Subscribe("personGrid.restore")
    public void onPersonGridRestore(Action.ActionPerformedEvent event) {
        Person p = personGrid.getSingleSelected();
        p.setDeletedBy(null);
        p.setDeleteTs(null);
        dataManager.commit(p);
    }


}