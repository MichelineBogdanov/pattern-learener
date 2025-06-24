package org.pattern_learener.behavioral.mediator.components;

import org.pattern_learener.behavioral.mediator.mediator.Mediator;

public interface Component {

    void setMediator(Mediator mediator);

    String getName();

}
