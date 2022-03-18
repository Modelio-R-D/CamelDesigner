package fr.softeam.cameldesigner.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.vbasic.version.Version;

@objid ("4b2a6f55-96b5-4bd8-8f83-c440dd3e930c")
public class CamelDesignerPeerModule implements ICamelDesignerPeerModule {
    @objid ("636e1216-cc93-4a08-8b15-d6544347a5e2")
    private IModuleAPIConfiguration peerConfiguration;

    @objid ("22edf731-59dc-41e5-9421-14fdd671305a")
    private CamelDesignerModule module = null;

    @objid ("3539600b-f9f6-4a25-b187-4cb5d5db12a6")
    public CamelDesignerPeerModule(final CamelDesignerModule module, final IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    @objid ("2a95c1f4-4082-4690-b1cc-572f27b11f45")
    @Override
    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    @objid ("d01c1035-ac45-4031-8476-9c5aa147ec07")
    @Override
    public String getDescription() {
        return this.module.getDescription();
    }

    @objid ("a3eeada1-e405-439b-805b-ed89a71ece33")
    @Override
    public String getName() {
        return this.module.getName();
    }

    @objid ("06d5ed65-3ecf-4adb-8f27-ed4ee21e9e85")
    @Override
    public Version getVersion() {
        return this.module.getVersion();
    }

    @objid ("713263a7-5b12-4d2a-a499-9ab1d0864892")
    void init() {
    }

}
