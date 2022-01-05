package fr.softeam.cameldesigner.utils;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IMetamodelExtensions;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MClass;

@objid ("17917d00-9360-4e3c-ad63-0b1dfa645c1d")
public class ModelUtils {
    @objid ("54cd29f5-44f2-431d-8f88-71f80c12fcf6")
    public static List<ModelElement> getStereotyped(String ster, String mclassName) {
        List<ModelElement> result = new ArrayList<>();
        IModelingSession modelingSession = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
        IMetamodelExtensions metamodelExtensions = modelingSession.getMetamodelExtensions();
        MClass mclass = CamelDesignerModule.getInstance().getModuleContext().getModelioServices().getMetamodelService().getMetamodel().getMClass(mclassName);
        metamodelExtensions.getStereotype(ICamelDesignerPeerModule.MODULE_NAME, ster, mclass );
        return result;
    }

}
