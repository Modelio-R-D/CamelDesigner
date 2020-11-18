package fr.softeam.cameldesigner.utils;

import java.util.ArrayList;
import java.util.List;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MClass;

public class ModelUtils {
    public static List<ModelElement> getStereotyped(String ster, String mclassName) {
        List<ModelElement> result = new ArrayList<>();
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        IMetamodelExtensions metamodelExtensions = modelingSession.getMetamodelExtensions();
        MClass mclass = CamelDesignerModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(mclassName);
        metamodelExtensions.getStereotype(ICamelDesignerPeerModule.MODULE_NAME, ster, mclass );
        return result;
    }

}
