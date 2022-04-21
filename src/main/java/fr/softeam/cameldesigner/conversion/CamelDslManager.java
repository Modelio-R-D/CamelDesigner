package fr.softeam.cameldesigner.conversion;

import camel.dsl.CamelDslStandaloneSetup;
import com.google.inject.Injector;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * @author kchaabouni
 */
@objid ("0e664ca3-18f2-4c00-b92f-3db0ab4c5c04")
public class CamelDslManager {
    @objid ("4b3de950-e3b1-471f-97c5-1cbaa0443fee")
    private Injector injector;

    @objid ("4f9596a6-4e35-4efe-bc54-c03a2d52f8fc")
    private CamelDslStandaloneSetup camelDslStandaloneSetup;

    @objid ("c61792a2-ba4e-4df6-9c2d-7c4533c04449")
    private static final CamelDslManager instance = new CamelDslManager();

    @objid ("54017f4c-4137-451f-9824-a53348d0a53c")
    private CamelDslManager() {
        super();
        
        this.camelDslStandaloneSetup = new CamelDslStandaloneSetup();
        
        this.injector = this.camelDslStandaloneSetup.createInjectorAndDoEMFRegistration();
    }

    @objid ("e191e5da-3785-4a36-8309-10ca1da10fcc")
    public static CamelDslManager getInstance() {
        return instance;
    }

    @objid ("54816202-a992-4f0c-b5f2-2a1f53c6de7b")
    public Injector getInjector() {
        return this.injector;
    }

}
