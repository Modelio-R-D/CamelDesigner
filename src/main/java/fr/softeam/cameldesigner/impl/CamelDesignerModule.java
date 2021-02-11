package fr.softeam.cameldesigner.impl;

import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.mda.IMdaExpert;
import org.modelio.api.module.parameter.IParameterEditionModel;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

public class CamelDesignerModule extends AbstractJavaModule {
    private static final String MODULE_IMAGE = "/res/icon/module.png";

    private CamelDesignerLifeCycleHandler lifeCycleHandler = null;

    private static CamelDesignerModule instance;

    private CamelDesignerPeerModule peerModule = null;

    public static CamelLogService logService;

    public CamelDesignerModule(final IModuleContext moduleContext) {
        super(moduleContext);
        
        CamelDesignerModule.instance = this;
        CamelDesignerModule.logService = new CamelLogService(this.getModuleContext().getLogService(), this);
        this.lifeCycleHandler  = new CamelDesignerLifeCycleHandler(this);
        this.peerModule = new CamelDesignerPeerModule(this, moduleContext.getPeerConfiguration());
        init();
    }

    @Override
    public CamelDesignerPeerModule getPeerModule() {
        return this.peerModule;
    }

    /**
     * Return the LifeCycleHandler  attached to the current module. This handler is used to manage the module lifecycle by declaring the desired implementation for the start, select... methods.
     */
    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.lifeCycleHandler;
    }

    /**
     * Method automatically called just after the creation of the module. The module is automatically instanciated at the beginning
     * of the MDA lifecycle and constructor implementation is not accessible to the module developer. The <code>init</code> method
     * allows the developer to execute the desired initialization.
     */
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        return super.getParametersEditionModel();
    }

    @Override
    public String getModuleImagePath() {
        return CamelDesignerModule.MODULE_IMAGE;
    }

    public static CamelDesignerModule getInstance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return instance;
    }

    @Override
    public IMdaExpert getMdaExpert(final Stereotype st) {
        // Generated code, please do not remove it
        IMdaExpert expert = getGeneratedMdaExpert(st);
        if (expert != null) {
            return expert;
        }// End generated code
        return null;
    }

    /**
     * Generated expert looking for a MDA expert in the generated MDA API.
     * 
     * @param st a stereotype owned by the current module.
     * @return a MDA expert belonging to the MDA API or <code>null</code>.
     */
    private IMdaExpert getGeneratedMdaExpert(final Stereotype st) {
        switch (st.getUuid()) {
            default: return null;
        }
    }

}
