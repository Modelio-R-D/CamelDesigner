package fr.softeam.cameldesigner.elementmodel.walker;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("009b6b59-7bd1-4a5e-82d0-9a6577352c28")
public interface IWalker<T> {
    @objid ("f452719f-348c-4743-a890-77a687316e9a")
    void walk(T element);

}
