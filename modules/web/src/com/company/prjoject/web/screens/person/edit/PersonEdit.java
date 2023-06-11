package com.company.prjoject.web.screens.person.edit;

import com.company.prjoject.entity.Person;
import com.haulmont.cuba.gui.screen.*;

@UiController("super_PersonEdit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
@DialogMode(resizable = true)
public class PersonEdit extends StandardEditor<Person> {
}