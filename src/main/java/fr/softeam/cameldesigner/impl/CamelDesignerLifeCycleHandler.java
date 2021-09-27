package fr.softeam.cameldesigner.impl;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.modelio.api.modelio.mc.IModelComponentDescriptor;
import org.modelio.api.modelio.mc.IModelComponentService;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;
import fr.softeam.cameldesigner.utils.CamelDesignerResourcesManager;

public class CamelDesignerLifeCycleHandler extends DefaultModuleLifeCycleHandler {

    private CamelModelChangeHandler modelChangeHandler = null;

    private String _ramcVersion = "1.0.05";

    public CamelDesignerLifeCycleHandler(final CamelDesignerModule module) {
        super(module);
    }

    @Override
    public boolean start() throws ModuleException {
        CamelDesignerResourcesManager.getInstance().setJMDAC(this.module);
        installRamc();
        return super.start();
    }

    @Override
    public void stop() throws ModuleException {
        super.stop();
    }

    /**
     * @return
     */
    public static boolean install(final String modelioPath, final String mdaPath) throws ModuleException {
        return DefaultModuleLifeCycleHandler.install(modelioPath, mdaPath);
    }

    @Override
    public boolean select() throws ModuleException {
        return super.select();
    }

    @Override
    public void upgrade(final Version oldVersion, final Map<String, String> oldParameters) throws ModuleException {
        super.upgrade(oldVersion, oldParameters);
    }

    @Override
    public void unselect() throws ModuleException {
        super.unselect();
    }

    private void installRamc() {
        Path mdaplugsPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();

        final IModelComponentService modelComponentService = CamelDesignerModule.getInstance().getModuleContext().getModelioServices().getModelComponentService();
        for (IModelComponentDescriptor mc : modelComponentService.getModelComponents()) {
            if (mc.getName().equals("MetaDataSchema")) {
                if (new Version(mc.getVersion()).isOlderThan(new Version(_ramcVersion))) {
                    modelComponentService.deployModelComponent(new File(mdaplugsPath.resolve("res" + File.separator + "ramc" + File.separator + "MetaDataSchema.ramc").toString()), new NullProgressMonitor());
                } else {
                    // Ramc already deployed...
                    return;
                }
            }
        }

        // No ramc found, deploy it
        modelComponentService.deployModelComponent(new File(mdaplugsPath.resolve("res" + File.separator + "ramc" + File.separator + "MetaDataSchema.ramc").toString()), new NullProgressMonitor());
    }

}
