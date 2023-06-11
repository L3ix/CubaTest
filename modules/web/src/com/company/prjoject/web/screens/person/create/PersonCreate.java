package com.company.prjoject.web.screens.person.create;

import com.company.prjoject.entity.Person;
import com.haulmont.cuba.gui.screen.*;

@UiController("super_PersonCreate")
@UiDescriptor("person-create.xml")
@EditedEntityContainer("personDc")
@DialogMode(resizable = true)
public class PersonCreate extends StandardEditor<Person> {



}