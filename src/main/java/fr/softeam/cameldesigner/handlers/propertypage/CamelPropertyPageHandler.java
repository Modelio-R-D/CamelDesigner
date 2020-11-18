package fr.softeam.cameldesigner.handlers.propertypage;

import java.util.List;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CamelPropertyPageHandler extends AbstractModulePropertyPage {
    private PropertyPageManager camelDesignerPropertyPageManager = new PropertyPageManager();

    public CamelPropertyPageHandler(final IModule module, final String name, final String label, final String bitmap) {
        super(module, name, label, bitmap);
    }

    @Override
    public void update(final List<MObject> selectedElements, final IModulePropertyTable table) {
        if ((selectedElements != null) && (selectedElements.size() > 0)
                && (selectedElements.get(0) != null)
                && (selectedElements.get(0) instanceof ModelElement)){
        
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
            this.camelDesignerPropertyPageManager.update(selectedElement, table);
        }
    }

    @Override
    public void changeProperty(final List<MObject> selectedElements, final int row, final String value) {
        if ((selectedElements != null) && (selectedElements.size() > 0) && (selectedElements.get(0) instanceof ModelElement)){
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
            this.camelDesignerPropertyPageManager.changeProperty(selectedElement, row, value);
        }
    }

}
