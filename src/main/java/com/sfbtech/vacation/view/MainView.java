package com.sfbtech.vacation.view;

import com.sfbtech.vacation.dao.PersonRepository;
import com.sfbtech.vacation.model.PersonEntity;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class MainView extends VerticalLayout {

    private final PersonRepository personRepository;

    private Grid<PersonEntity> grid = new Grid<>();

    @Autowired
    public MainView(PersonRepository personRepository){
        this.personRepository = personRepository;
        add(grid);
        grid.setItems(personRepository.findAll());
    }


}
