package fr.softeam.cameldesigner.impl;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.vbasic.version.Version;

public class CamelDesignerPeerModule implements ICamelDesignerPeerModule {
    private CamelDesignerModule module = null;

    private IModuleAPIConfiguration peerConfiguration;

    public CamelDesignerPeerModule(final CamelDesignerModule module, final IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    public String getDescription() {
        return this.module.getDescription();
    }

    public String getName() {
        return this.module.getName();
    }

    public Version getVersion() {
        return this.module.getVersion();
    }

    void init() {
    }

}
