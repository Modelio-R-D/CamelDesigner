package fr.softeam.cameldesigner.elementmodel.properties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("11a9063e-642c-4299-9fca-a35013ac5577")
public class TagsManager {
    @objid ("83c2f245-01e5-4e7c-a00d-c073eced79fa")
    public void createTag(ModelElement element, String tagType, String tagValue) {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        TaggedValue taggedValue = modelingSession.getModel().createTaggedValue(ICamelDesignerPeerModule.MODULE_NAME, 
                tagType, 
                element);
        TagParameter tagParameter= modelingSession.getModel().createTagParameter(tagValue, taggedValue);
        taggedValue.getActual().add(0,tagParameter);
    }

}
