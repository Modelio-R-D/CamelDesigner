package fr.softeam.cameldesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IPeerModule;

@objid ("f41f3406-c3d5-4a1c-bda3-d60fb2269b2c")
public interface ICamelDesignerPeerModule extends IPeerModule {
    @objid ("7ac1d3c2-b479-4864-8473-835cf3a9ccca")
    public static final String MODULE_NAME = "CamelDesigner";

    @objid ("95319027-a67c-41a7-9e20-268501973169")
    public static final String CAMEL_STYLE = "CamelStyle";

}
