package fr.softeam.cameldesigner.elementmodel.properties;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

public class TagsManager {
    public void createTag(ModelElement element, String tagType, String tagValue) {
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        TaggedValue taggedValue = modelingSession.getModel().createTaggedValue(ICamelDesignerPeerModule.MODULE_NAME, 
                tagType, 
                element);
        TagParameter tagParameter= modelingSession.getModel().createTagParameter(tagValue, taggedValue);
        taggedValue.getActual().add(0,tagParameter);
    }

}
