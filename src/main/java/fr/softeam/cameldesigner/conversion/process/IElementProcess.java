package fr.softeam.cameldesigner.conversion.process;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d936de5f-7216-4279-ab45-bc08d06d9c73")
public interface IElementProcess<T, V> {
    @objid ("45d4c163-ef7a-4d4c-aaa1-6cc268510b8c")
    T process(V element, V context);

}
