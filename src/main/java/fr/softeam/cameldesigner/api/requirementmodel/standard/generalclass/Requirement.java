/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link GeneralClass} with << Requirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cd14264b-97fa-49a6-bb0d-db04d8c66386")
public abstract class Requirement extends FeatureClassifier {
    @objid ("c59f33c2-a3e4-4c1f-ab06-015589757583")
    public static final String STEREOTYPE_NAME = "Requirement";

    /**
     * Tells whether a {@link Requirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << Requirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("699f4326-a2c5-4b32-89ab-2d97342f3833")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Requirement.STEREOTYPE_NAME));
    }

    @objid ("0056596f-c1e1-4526-bf86-f8e12836b25a")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Requirement other = (Requirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}.
     * 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("780eea4b-b946-45a3-be1d-be730e78ffeb")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    @objid ("8c909089-6a44-491a-ba12-58c5882b664b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("64b5d0d5-2198-4b77-947e-424962858e5a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ecb6e028-47dc-43d2-8e62-c18428e02855")
    protected Requirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("d168a813-2ca0-4031-921a-6b0cec2ba4ee")
    public static final class MdaTypes {
        @objid ("bd8fa0c5-a2d1-406a-8bd8-d10c082961fb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3aaaae6-746e-4c6f-a5c6-ef69b3ca0424")
        private static Stereotype MDAASSOCDEP;

        @objid ("c80ded59-86c0-4672-b0a9-1c9c7ba60e2a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27bb5118-57e6-40f7-a6a5-a0bec66f6ca8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f14398cc-a1c7-4953-9874-f7819f1ec4f7");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

}
