package fr.softeam.cameldesigner.conversion;

import camel.dsl.CamelDslStandaloneSetup;
import com.google.inject.Injector;

/**
 * @author kchaabouni
 */
public class CamelDslManager {
    private CamelDslStandaloneSetup camelDslStandaloneSetup;

    private Injector injector;

    private static final CamelDslManager instance = new CamelDslManager();

    private CamelDslManager() {
        super();
        
        this.camelDslStandaloneSetup = new CamelDslStandaloneSetup();
        
        this.injector = this.camelDslStandaloneSetup.createInjectorAndDoEMFRegistration();
    }

    public static CamelDslManager getInstance() {
        return instance;
    }

    public Injector getInjector() {
        return this.injector;
    }

}
